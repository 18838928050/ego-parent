/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemServiceImpl.java 
 *
 * @Date:  2019年6月6日  上午10:27:02
 *
 * @Package com.ego.manage.service.impl
 */

package com.ego.manage.service.impl;


import java.util.Date;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.utils.IDUtils;
import com.ego.dubbo.service.TbItemDescDubboService;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.manage.service.TbItemService;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;

/**
 * @author 付慧芳
 * 
 *         日期：2019年6月6日 上午10:27:02
 *
 *         描述：
 * @version V1.0
 *
 */
@Service
public class TbItemServiceImpl implements TbItemService {

	@Reference
	private TbItemDubboService tbItemServiceImpl;
	@Reference
	private TbItemDescDubboService tbItemDescDubboService;

	@Override
	public EasyUIDataGrid show(int page, int rows) {
		return tbItemServiceImpl.show(page, rows);
	}

	/** 
	 * @param ids
	 * @param status
	 * @return 
	 */
	
	
	@Override
	public int update(String ids, byte status) {
		int index=0;
		TbItem tbItem=new TbItem();
		String[] idsStr=ids.split(",");
		for (String id : idsStr) {
			tbItem.setId(Long.parseLong(id));
			tbItem.setStatus(status);
			index+=tbItemServiceImpl.updItemStatus(tbItem);
		}
		if(index==idsStr.length){
			return 1;
		}else{
			return 0;
		}
	}

	/** 
	 * @param item
	 * @param desc
	 * @return 
	 */
	
	
	@Override
	public int save(TbItem item, String desc) {
		long id=IDUtils.genItemId();
		item.setId(id);
		Date date=new Date();
		item.setCreated(date);
		item.setUpdated(date);
		item.setStatus((byte)1);
		int index=tbItemServiceImpl.insTbItem(item);
		if (index>0) {
			TbItemDesc itemDesc=new TbItemDesc();
			itemDesc.setItemDesc(desc);
			itemDesc.setItemId(id);
			itemDesc.setCreated(date);
			itemDesc.setUpdated(date);
			index+=tbItemDescDubboService.insDesc(itemDesc);
			
		}
		if (index==2) {
			return 1;
			
		}
		return 0;
	}

}
