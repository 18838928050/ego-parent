/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: EgoResulet.java 
 *
 * @Date:  2019年6月6日  下午3:21:58
 *
 * @Package com.ego.commons.pojo
 */


package com.ego.commons.pojo;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月6日 下午3:21:58
 *
 * 描述：
 * @version V1.0
 *
 */

public class EgoResult {
	private int status;
	private Object data;

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	

}
