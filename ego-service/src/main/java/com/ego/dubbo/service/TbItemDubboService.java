/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemDubboService.java 
 *
 * @Date:  2019年6月4日  上午11:05:05
 *
 * @Package com.ego.dubbo.service
 */


package com.ego.dubbo.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月4日 上午11:05:05
 *
 * 描述：
 * @version V1.0
 *
 */

public interface TbItemDubboService {
    EasyUIDataGrid show(int page,int rows);
    int updItemStatus(TbItem tbItem);
    int insTbItem(TbItem tbItem);
}
