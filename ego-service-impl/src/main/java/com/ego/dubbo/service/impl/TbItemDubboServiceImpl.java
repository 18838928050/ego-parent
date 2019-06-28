/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemDubboServiceImpl.java 
 *
 * @Date:  2019年6月4日  上午11:13:05
 *
 * @Package com.ego.dubbo.service.impl
 */


package com.ego.dubbo.service.impl;


import java.util.List;

import javax.annotation.Resource;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.mapper.TbItemMapper;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月4日 上午11:13:05
 *
 * 描述：
 * @version V1.0
 *
 */

public class TbItemDubboServiceImpl implements TbItemDubboService {

	/** 
	 * @param page
	 * @param rows
	 * @return 
	 */
	@Resource
	private TbItemMapper tbItemMapper;
	
	@Override
	public EasyUIDataGrid show(int page, int rows) {
		PageHelper.startPage(page, rows);
		//查询全部
		List<TbItem> list = tbItemMapper.selectByExample(new TbItemExample());
		//分页代码
		//设置分页条件
		PageInfo<TbItem> pi = new PageInfo<>(list);
		
		//放入到实体类
		EasyUIDataGrid datagrid = new EasyUIDataGrid();
		datagrid.setRows(pi.getList());
		datagrid.setTotal(pi.getTotal());
		return datagrid;
	}

	/** 
	 * @param id
	 * @param status
	 * @return 
	 */
	
	
	
	@Override
	public int updItemStatus(TbItem tbItem) {
		
		return tbItemMapper.updateByPrimaryKeySelective(tbItem);
	}

	/** 
	 * @param tbItem
	 * @return 
	 */
	
	
	@Override
	public int insTbItem(TbItem tbItem) {
		return tbItemMapper.insert(tbItem);
	}

}
