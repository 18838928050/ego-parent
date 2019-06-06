/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: EasyUIDataGrid.java 
 *
 * @Date:  2019年6月4日  上午11:07:16
 *
 * @Package com.ego.commons.pojo
 */


package com.ego.commons.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author 付慧芳
 * 
 * 日期：2019年6月4日 上午11:07:16
 *
 * 描述：
 * @version V1.0
 *
 */

public class EasyUIDataGrid implements Serializable {

	/**
	 * @return the rows
	 */
	public List<?> getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	private List<?> rows;
	private long total;
	/** 
	 * @return 
	 */
	
	
	
}
