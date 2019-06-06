/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: TbItemCatController.java 
 *
 * @Date:  2019年6月6日  下午6:47:40
 *
 * @Package com.ego.manage.controller
 */


package com.ego.manage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUiTree;
import com.ego.manage.service.TbItemCatService;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 下午6:47:40
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
public class TbItemCatController {

	@Resource
	private TbItemCatService tbItemCatServiceImpl;
	/**
	 * 显示商品类目
	 * @param id
	 * @return
	 */
	@RequestMapping("item/cat/list")
	@ResponseBody
	public List<EasyUiTree> showCat(@RequestParam(defaultValue="0") long id){
		return tbItemCatServiceImpl.show(id);
	}
	
	
}
