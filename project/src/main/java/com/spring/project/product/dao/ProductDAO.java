package com.spring.project.product.dao;

import java.util.List;

import com.spring.project.product.vo.PagingVO;
import com.spring.project.product.vo.ProductVO;

public interface ProductDAO {
	public void insertProduct(ProductVO vo);
	public void updateProduct(ProductVO vo);
	public void deleteProduct(ProductVO vo);
	public ProductVO getProduct(ProductVO vo);
	public List<ProductVO> getProductList(ProductVO vo);
	public List<ProductVO> selectProduct(PagingVO vo);
	public int countProduct();
}
