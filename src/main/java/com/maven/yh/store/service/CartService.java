package com.maven.yh.store.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.yh.store.vo.CartListVO;
import com.maven.yh.store.vo.ProductBuyInfoVO;

@Service
public class CartService {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 상품을 장바구니에 추가
	public int setCartList(ProductBuyInfoVO pbv) {
		return sqlSession.insert("setCartList", pbv);
	}

	// 장바구니에 물건이 중복되나 안되나 체크
	public String myCartProductCheck(ProductBuyInfoVO pbv) {
		return sqlSession.selectOne("myCartProductCheck", pbv);
	}

	// 카테고리에 중복 물건이 존재할 경우, 수량을 업데이트
	public int upadateQty(ProductBuyInfoVO pbv) {
		return sqlSession.update("upadateQty", pbv);
	}

	// 헤더 영역에 장바구니에 담겨있는 물건의 수량을 카운트해서 리턴
	public int getCartCount(ProductBuyInfoVO pbv) {
		return sqlSession.selectOne("getCartCount", pbv);
	}

	// 장바구니에 담겨있는 물건을 출력해줌
	public List<CartListVO> getCartList(ProductBuyInfoVO pbv) {
		return sqlSession.selectList("getCartList", pbv);
	}

	// 카트 아이디에 몇개의 상품이 들어있는지 확인
	public int myCartProductQty(String cartID) {
		return sqlSession.selectOne("myCartProductQty", cartID);
	}
	
	// 카트 리스트 내용 삭제
	public int deleteCartList(ProductBuyInfoVO pbv) {
		return sqlSession.delete("deleteCartList", pbv);
	}

	// 로그인시 카트 내용 업데이트 (쿠키 에서 세션으로)
	public int upadateCart(Map<String, String> cs) {
		return sqlSession.update("updateCart",cs);
		
	}

	public int updateQtyCartList(ProductBuyInfoVO pbv) {
		return sqlSession.update("updateQtyCart",pbv);
	}
	
}