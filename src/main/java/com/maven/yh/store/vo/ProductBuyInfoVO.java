package com.maven.yh.store.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductBuyInfoVO extends ConnectionInfoVO {

	private int id;     // 제품번호,카트번
	private int qty;    // 제품수량
	private String cartID; // 카트 ID 값
	
}
