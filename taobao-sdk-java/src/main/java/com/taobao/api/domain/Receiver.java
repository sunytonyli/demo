package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiClass;
import com.taobao.api.internal.mapping.ApiField;


import com.taobao.api.TaobaoObject;

/**
 * Receiver Data Structure.
 * 
 * DESC：收货人详细信息 
 *
 * @author auto create
 * @since 1.0, 2010-08-23 20:27:05.0
 */
@ApiClass("Receiver")
public class Receiver extends TaobaoObject {

	private static final long serialVersionUID = 3255546755862511195L;

	
	/** 
	 * 收货人的详细地址信息
	 **/
	@ApiField("address")
	private String address;

	
	/** 
	 * 收货人的城市
	 **/
	@ApiField("city")
	private String city;

	
	/** 
	 * 区/县
	 **/
	@ApiField("district")
	private String district;

	
	/** 
	 * 移动电话。
	 **/
	@ApiField("mobile_phone")
	private String mobilePhone;

	
	/** 
	 * 收货人全名。
	 **/
	@ApiField("name")
	private String name;

	
	/** 
	 * 固定电话。
	 **/
	@ApiField("phone")
	private String phone;

	
	/** 
	 * 收货人所在省份
	 **/
	@ApiField("state")
	private String state;

	
	/** 
	 * 邮政编码
	 **/
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
