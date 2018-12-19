package com.briup.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.SysRole;
import com.briup.common.exception.CrmCommonException;
import com.briup.service.interf.ISysUserService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private ISysUserService roleService;
	
	@RequestMapping("/showAllRole")
	public String showAllRole(HttpServletRequest request) {
		try {
			List<SysRole> roleList = roleService.findAllRole();
			request.getSession().setAttribute("roleList", roleList);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "systemset/role_manager";
	}
	
	@RequestMapping("/addRole")
	public String addRole(HttpServletRequest request) {
		return "systemset/addRole";
	}
	
	@RequestMapping("/addRoleSecucess")
	public String addRole(SysRole role,HttpServletRequest request) {
		try {
			roleService.addRole(role);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "redirect:showAllRole";
	}
	
}
