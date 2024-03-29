package com.taobao.api.request;

import java.util.Map;
import java.util.Date;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.TaobaoRequest;

/**
 * TOP API: taobao.item.update.delisting request
 * 
 * @author auto create
 * @since 1.0, 2010-11-12 10:14:01.0
 */
public class ItemUpdateDelistingRequest implements TaobaoRequest {
	private Long timestamp;	
	private TaobaoHashMap textParams = new TaobaoHashMap();


	
	/** 
	 * 商品数字ID，该参数必须
	 **/
	private Long numIid;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	 public Long getNumIid() {
		return this.numIid;
	}
	
	public String getApiMethodName() {
		return "taobao.item.update.delisting";
	}

	public Map<String, String> getTextParams() {		
		textParams.put("num_iid", this.numIid);
		return textParams;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
