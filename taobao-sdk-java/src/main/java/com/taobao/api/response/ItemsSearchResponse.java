package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ItemSearch;


import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.search response
 * 
 * @author auto create
 * @since 1.0,2010-09-03 10:00:39.0
 */
public class ItemsSearchResponse extends TaobaoResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7119755889448695963L;

	
	/** 
	 * 搜索到的商品，具体字段根据权限和设定的fields决定
	 **/
	@ApiField("item_search")
	private ItemSearch itemSearch;
	
	/** 
	 * 搜索到符合条件的结果总数
	 **/
	@ApiField("total_results")
	private Long totalResults;

	public void setItemSearch(ItemSearch itemSearch) {
		this.itemSearch = itemSearch;
	}

	public ItemSearch getItemSearch( ) {
		return this.itemSearch;
	}
	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public String getApiMethodName() {
		return "taobao.items.search";
	}

}
