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

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.manage.service.TbItemService;

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
	private TbItemDubboService TbItemServiceImpl;

	@Override
	public EasyUIDataGrid show(int page, int rows) {
		return TbItemServiceImpl.show(page, rows);
	}

}
