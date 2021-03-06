package com.maven.yh.store.vo;

import java.util.Date;

import lombok.Data;
import lombok.Setter;

@Data
public class ProductVO {
	
	private int id;                 // 제품 아이디
	private int price;              // 제품 가격
	private String thumbnail;       // 제품 대표이미지
	private String name;            // 제품 이름
	private String content;         // 제품 내용
	private String freeDelivery;    // 제품 무료배송 여부
	private int deliveryFare;       // 제품 배송비
	private Date regdate;           // 제품 등록 날짜
	
}
