/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemCatDubboService.java 
 *
 * @Date:  2019年6月6日  下午6:15:37
 *
 * @Package com.ego.dubbo.service
 */


package com.ego.dubbo.service;


import java.util.List;

import com.ego.pojo.TbItemCat;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 下午6:15:37
 *
 * 描述：
 * @version V1.0
 *
 */

public interface TbItemCatDubboService {

	/**
	 * 根据父类目id查询所有子类目
	 * @param pid
	 * @return
	 */
	List<TbItemCat> show(Long pid);
	
}
