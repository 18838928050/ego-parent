/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: PicService.java 
 *
 * @Date:  2019年6月27日  下午10:11:02
 *
 * @Package com.ego.manage.service
 */


package com.ego.manage.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月27日 下午10:11:02
 *
 * 描述：
 * @version V1.0
 *
 */

public interface PicService {

	/**
	 * 文件上传
	 * @param file
	 * @return
	 * @throws IOException 
	 */
	Map<String,Object> upload(MultipartFile file) throws IOException;
	
}
