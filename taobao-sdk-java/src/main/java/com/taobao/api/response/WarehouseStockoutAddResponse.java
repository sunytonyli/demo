package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;


import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.warehouse.stockout.add response
 * 
 * @author auto create
 * @since 1.0,2010-10-21 08:47:38.0
 */
public class WarehouseStockoutAddResponse extends TaobaoResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8267863963412461662L;

	
	/** 
	 * 出库单编号
	 **/
	@ApiField("crk_code")
	private String crkCode;
	
	/** 
	 * 修改时间
	 **/
	@ApiField("modify_time")
	private Date modifyTime;
	
	/** 
	 * 新增入库单是否成功
	 **/
	@ApiField("success")
	private Boolean success;

	public void setCrkCode(String crkCode) {
		this.crkCode = crkCode;
	}

	public String getCrkCode( ) {
		return this.crkCode;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime( ) {
		return this.modifyTime;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getSuccess( ) {
		return this.success;
	}

	public String getApiMethodName() {
		return "taobao.warehouse.stockout.add";
	}

}
