package com.spring.project.product.service;

import java.util.List;

import com.spring.project.product.vo.PagingVO;
import com.spring.project.product.vo.ProductVO;

public interface ProductService {

	public int countBoard();

	public List<ProductVO> selectProduct(PagingVO vo);
	
	public List<ProductVO> getProductList(ProductVO vo);
	
	public ProductVO getProduct(ProductVO vo);
	
}
