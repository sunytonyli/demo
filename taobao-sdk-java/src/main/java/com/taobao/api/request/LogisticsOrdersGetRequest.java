package com.taobao.api.request;
import java.util.Date;

import java.util.Map;
import java.util.Date;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.TaobaoRequest;

/**
 * TOP API: taobao.logistics.orders.get request
 * 
 * @author auto create
 * @since 1.0, 2010-08-19 19:30:11.0
 */
public class LogisticsOrdersGetRequest implements TaobaoRequest {
	private Long timestamp;	
	private TaobaoHashMap textParams = new TaobaoHashMap();


	
	/** 
	 * 买家昵称
	 **/
	private String buyerNick;
	
	/** 
	 * 创建时间结束
	 **/
	private Date endCreated;
	
	/** 
	 * 需返回的字段列表.可选值:Shipping 物流数据结构中的以下字段: 
tid,seller_nick,buyer_nick,delivery_start, delivery_end,out_sid,item_title,receiver_name, created,modified,status,type,freight_payer,seller_confirm,company_name；多个字段之间用","分隔。如tid,seller_nick,buyer_nick,delivery_start。
	 **/
	private String fields;
	
	/** 
	 * 谁承担运费.可选值:buyer(买家),seller(卖家).如:buyer
	 **/
	private String freightPayer;
	
	/** 
	 * 页码.该字段没传 或 值<1 ,则默认page_no为1
	 **/
	private Long pageNo;
	
	/** 
	 * 每页条数.该字段没传 或 值<1 ,则默认page_size为40
	 **/
	private Long pageSize;
	
	/** 
	 * 收货人姓名
	 **/
	private String receiverName;
	
	/** 
	 * 卖家是否发货.可选值:yes(是),no(否).如:yes
	 **/
	private String sellerConfirm;
	
	/** 
	 * 创建时间开始
	 **/
	private Date startCreated;
	
	/** 
	 * 物流状态.查看数据结构 Shipping 中的status字段.
	 **/
	private String status;
	
	/** 
	 * 交易ID.如果加入tid参数的话,不用传其他的参数,但是仅会返回一条物流订单信息.
	 **/
	private Long tid;
	
	/** 
	 * 物流方式.可选值:post(平邮),express(快递),ems(EMS).如:post
	 **/
	private String type;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	 public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	 public Date getEndCreated() {
		return this.endCreated;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	 public String getFields() {
		return this.fields;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}
	 public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	 public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	 public Long getPageSize() {
		return this.pageSize;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	 public String getReceiverName() {
		return this.receiverName;
	}
	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}
	 public String getSellerConfirm() {
		return this.sellerConfirm;
	}
	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	 public Date getStartCreated() {
		return this.startCreated;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 public String getStatus() {
		return this.status;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	 public Long getTid() {
		return this.tid;
	}
	public void setType(String type) {
		this.type = type;
	}
	 public String getType() {
		return this.type;
	}
	
	public String getApiMethodName() {
		return "taobao.logistics.orders.get";
	}

	public Map<String, String> getTextParams() {		
		textParams.put("buyer_nick", this.buyerNick);
		textParams.put("end_created", this.endCreated);
		textParams.put("fields", this.fields);
		textParams.put("freight_payer", this.freightPayer);
		textParams.put("page_no", this.pageNo);
		textParams.put("page_size", this.pageSize);
		textParams.put("receiver_name", this.receiverName);
		textParams.put("seller_confirm", this.sellerConfirm);
		textParams.put("start_created", this.startCreated);
		textParams.put("status", this.status);
		textParams.put("tid", this.tid);
		textParams.put("type", this.type);
		return textParams;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
