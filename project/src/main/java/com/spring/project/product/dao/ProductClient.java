package com.spring.project.product.dao;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.project.product.service.ProductService;
import com.spring.project.product.vo.ProductVO;

public class ProductClient {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		ProductService productService = (ProductService)context.getBean("productService");
		ProductVO vo = new ProductVO();
//		vo.setPno(27);
//		ProductVO product = productService.getProduct(vo)
		List<ProductVO> products = (List<ProductVO>) productService.getProductList(vo);
		for (ProductVO product : products) {
			System.out.println(product.toString());			
		}
		context.close();

	}

}
