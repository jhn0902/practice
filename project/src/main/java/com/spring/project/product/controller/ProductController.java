package com.spring.project.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.project.product.service.ProductService;
import com.spring.project.product.vo.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getProductList.do")
	public ModelAndView getProductList(ProductVO vo, ModelAndView mav) {
		System.out.println("getProductList 호출");
		mav.addObject("productList", productService.getProductList(vo));
		mav.setViewName("boardList");
		return mav;
	}
}
