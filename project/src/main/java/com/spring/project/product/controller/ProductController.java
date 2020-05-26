package com.spring.project.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.project.product.service.ProductService;
import com.spring.project.product.vo.PagingVO;
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
	
	@RequestMapping("/getProduct.do")
	public ModelAndView GetProduct(ProductVO vo, ModelAndView mav) {
		System.out.println("getProduct 호출");
		mav.addObject("product", productService.getProduct(vo));
		mav.setViewName("updateProduct");
		return mav;
	}
	
	@RequestMapping("/productList.do")
	public ModelAndView ProductList(PagingVO vo, ModelAndView mav
			, @RequestParam(value = "nowPage", required = false)String nowPage
			, @RequestParam(value = "cntPerPage", required = false)String cntPerPage) {
		System.out.println("productList 호출");
		int total = productService.countBoard();
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "10";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) {
			cntPerPage = "10";
		}
		vo = new PagingVO(Integer.parseInt(nowPage), total, Integer.parseInt(cntPerPage));
		mav.addObject("paging", vo);
		mav.addObject("productList", productService.selectProduct(vo));
		mav.setViewName("productList");
		return mav;
	}
	
	@RequestMapping("/insertProduct.do")
	public ModelAndView InsertProduct(ProductVO vo, ModelAndView mav) {
		System.out.println("InsertProduct 호출");
		productService.insertProduct(vo);
		mav.setViewName("redirect:productList.do");
		return mav;
	}
	
	@RequestMapping("/updateProduct.do")
	public ModelAndView UpdateProduct(ProductVO vo, ModelAndView mav) {
		productService.updateProduct(vo);
		mav.setViewName("redirect:productList.do");
		return mav;
	}
	
	@RequestMapping("/deleteProduct.do")
	public ModelAndView DeleteProduct(ProductVO vo, ModelAndView mav) {
		productService.deleteProduct(vo);
		mav.setViewName("redirect:productList.do");
		return mav;
	}
}



































