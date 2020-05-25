package com.spring.project.product.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.project.product.dao.ProductDAO;
import com.spring.project.product.vo.ProductVO;

@Repository
public class OracleProductDAO implements ProductDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertProduct(ProductVO vo) {

	}

	@Override
	public void updateProduct(ProductVO vo) {

	}

	@Override
	public void deleteProduct(ProductVO vo) {

	}

	@Override
	public ProductVO getProduct(ProductVO vo) {
		return sqlSessionTemplate.selectOne("ProductDAO.getProduct", vo);
	}

	@Override
	public List<ProductVO> getProductList(ProductVO vo) {
		return sqlSessionTemplate.selectList("ProductDAO.getProductList", vo);
	}

}
