package com.taobao.api;


/**
 * TOP响应解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface TaobaoParser<T extends TaobaoResponse> {

	/**
	 * 把响应字符串解释成相应的领域对象。
	 * 
	 * @param rsp 响应字符串
	 * @return 领域对象
	 */
	public T parse(String rsp , String api) throws ApiException;
	
	public Class<T> getClazz() throws ApiException;

}
