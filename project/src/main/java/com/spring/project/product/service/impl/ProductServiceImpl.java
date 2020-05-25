package com.spring.project.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.product.dao.ProductDAO;
import com.spring.project.product.service.ProductService;
import com.spring.project.product.vo.PagingVO;
import com.spring.project.product.vo.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<ProductVO> getProductList(ProductVO vo) {
		return productDAO.getProductList(vo);
	}
	
	@Override
	public ProductVO getProduct(ProductVO vo) {
		return productDAO.getProduct(vo);
	}

	@Override
	public int countBoard() {
		return productDAO.countProduct();
	}

	@Override
	public List<ProductVO> selectProduct(PagingVO vo) {
		return productDAO.selectProduct(vo);
	}
}
