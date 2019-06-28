/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemDescDubboServiceImpl.java 
 *
 * @Date:  2019年6月28日  下午1:46:48
 *
 * @Package com.ego.dubbo.service.impl
 */


package com.ego.dubbo.service.impl;

import javax.annotation.Resource;

import com.ego.dubbo.service.TbItemDescDubboService;
import com.ego.mapper.TbItemDescMapper;
import com.ego.pojo.TbItemDesc;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月28日 下午1:46:48
 *
 * 描述：
 * @version V1.0
 *
 */

public class TbItemDescDubboServiceImpl implements TbItemDescDubboService{

	@Resource
	private TbItemDescMapper tbItemDescMapper;
	
	@Override
	public int insDesc(TbItemDesc itemDesc) {
		return tbItemDescMapper.insert(itemDesc);
	}

}
