/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemService.java 
 *
 * @Date:  2019年6月6日  上午10:25:50
 *
 * @Package com.ego.manage.service
 */


package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 上午10:25:50
 *
 * 描述：
 * @version V1.0
 *
 */

public interface TbItemService {
 EasyUIDataGrid show(int page,int rows);
 /**
  * 批量修改商品状态
  * @param ids
  * @param status
  * @return
  */
 int update(String ids,byte status);
}
