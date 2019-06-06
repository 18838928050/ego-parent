/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: PageController.java 
 *
 * @Date:  2019年6月4日  上午10:42:01
 *
 * @Package com.ego.manage.controller
 */


package com.ego.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月4日 上午10:42:01
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
public class PageController {
 
	@RequestMapping("/")
	public String welcome(){
		return "index";
	}
	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
