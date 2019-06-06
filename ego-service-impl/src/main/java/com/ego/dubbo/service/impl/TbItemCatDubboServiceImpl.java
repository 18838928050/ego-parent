/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemCatDubboServiceImpl.java 
 *
 * @Date:  2019年6月6日  下午6:20:16
 *
 * @Package com.ego.dubbo.service.impl
 */


package com.ego.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ego.dubbo.service.TbItemCatDubboService;
import com.ego.mapper.TbItemCatMapper;
import com.ego.pojo.TbItemCat;
import com.ego.pojo.TbItemCatExample;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 下午6:20:16
 *
 * 描述：
 * @version V1.0
 *
 */

public class TbItemCatDubboServiceImpl  implements TbItemCatDubboService{

	@Resource
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List<TbItemCat> show(Long  pid) {
		TbItemCatExample example=new TbItemCatExample();
		example.createCriteria().andParentIdEqualTo(pid);
		return 	tbItemCatMapper.selectByExample(example);
	}
	

}
