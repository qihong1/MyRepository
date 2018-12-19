package com.briup.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.Product;
import com.briup.bean.Storage;
import com.briup.common.exception.CrmCommonException;
import com.briup.service.interf.IBasicDataService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IBasicDataService basicDateService;
	
	@RequestMapping("/{curpage}/showAllProduct")
	public String showAllProduct(@PathVariable int curpage,HttpServletRequest request) {
		try {
			PageInfo<Product> pageInfo = basicDateService.findAllProduct(curpage, 5);
			request.getSession().setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "basic/product";
	}
	
	@RequestMapping("/{curpage}/showProduct")
	public String showProductByCon(@PathVariable int curpage,Product product,HttpServletRequest request) {
		try {
			PageInfo<Product> pageInfo = basicDateService.findProduct(product, curpage, 5);
			request.getSession().setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		
		return "basic/product";
	}
	
	@RequestMapping("/{curpage}/showAllStorage")
	public String findAllStorage(@PathVariable int curpage,HttpServletRequest request) {
		try {
			PageInfo<Storage> pageInfo = basicDateService.findAllStorage(curpage, 5);
			request.getSession().setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "basic/storage";
	}
	
	@RequestMapping("/{curpage}/showStorage")
	public String showProductByCon(@PathVariable int curpage,Storage storage,HttpServletRequest request) {
		try {
			PageInfo<Storage> pageInfo = basicDateService.findStorage(storage, curpage, 5);
			request.getSession().setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		
		return "basic/storage";
	}
}
