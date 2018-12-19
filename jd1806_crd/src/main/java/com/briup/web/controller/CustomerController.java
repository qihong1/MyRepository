package com.briup.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.briup.bean.CstCustomer;
import com.briup.common.exception.CrmCommonException;
import com.briup.service.interf.ICustomerService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(value="/{curPage}/findAllCustomer")
	public String fingAllCustomer(@PathVariable int curPage,HttpSession session) {
		try {
			PageInfo<CstCustomer> pageInfo = customerService.findAllCstCustomer(curPage, 5);
			session.setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/list";
	}
	
	@RequestMapping(value="/{curPage}/findPageByConfig",method=RequestMethod.POST)
	public String findPageByConfig(@PathVariable int curPage,HttpSession session,CstCustomer cstCustomer) {
		try {
			PageInfo<CstCustomer> pageInfo = customerService.findCustomerPageByCon(curPage, 5, cstCustomer);
			session.setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/list";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(HttpServletRequest request) {
		return "cust_info/add_customer";
	}
	
	@RequestMapping("/addCustomerOk")
	public String addCustomerOk(CstCustomer customer,HttpServletRequest request) {
		try {
			customerService.saveCustomer(customer);
			
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "redirect:/customer/1/findAllCustomer";
	}
}
