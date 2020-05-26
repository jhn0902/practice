package com.spring.project.product.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.project.product.dao.ProductDAO;
import com.spring.project.product.vo.PagingVO;
import com.spring.project.product.vo.ProductVO;

@Repository
public class OracleProductDAO implements ProductDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertProduct(ProductVO vo) {
		System.out.println("sqltemplate insertboard 호출");
		sqlSessionTemplate.insert("ProductDAO.insertProduct", vo);
	}

	@Override
	public void updateProduct(ProductVO vo) {
		sqlSessionTemplate.update("ProductDAO.updateProduct", vo);
	}

	@Override
	public void deleteProduct(ProductVO vo) {
		sqlSessionTemplate.delete("ProductDAO.deleteProduct", vo);
	}

	@Override
	public ProductVO getProduct(ProductVO vo) {
		return sqlSessionTemplate.selectOne("ProductDAO.getProduct", vo);
	}

	@Override
	public List<ProductVO> getProductList(ProductVO vo) {
		return sqlSessionTemplate.selectList("ProductDAO.getProductList", vo);
	}

	@Override
	public List<ProductVO> selectProduct(PagingVO vo) {
		return sqlSessionTemplate.selectList("ProductDAO.getProductList", vo);
	}

	@Override
	public int countProduct() {
		return sqlSessionTemplate.selectOne("ProductDAO.countProduct");
	}

}
