/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemCatService.java 
 *
 * @Date:  2019年6月6日  下午6:30:09
 *
 * @Package com.ego.manage.service
 */


package com.ego.manage.service;

import java.util.List;

import com.ego.commons.pojo.EasyUiTree;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 下午6:30:09
 *
 * 描述：
 * @version V1.0
 *
 */

public interface TbItemCatService {

	/**
	 * 根据父菜单id显示所有菜单
	 * @param pid
	 * @return
	 */
	List<EasyUiTree> show(long pid);
}
