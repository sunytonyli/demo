package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;


import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.warehouse.stockin.add response
 * 
 * @author auto create
 * @since 1.0,2010-10-21 08:47:21.0
 */
public class WarehouseStockinAddResponse extends TaobaoResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5784155764123293538L;

	
	/** 
	 * 入库单编号
	 **/
	@ApiField("crk_code")
	private String crkCode;
	
	/** 
	 * 修改时间
	 **/
	@ApiField("modify_time")
	private Date modifyTime;
	
	/** 
	 * 成功标志
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
		return "taobao.warehouse.stockin.add";
	}

}
