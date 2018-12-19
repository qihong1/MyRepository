package com.briup.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.bean.SysRole;
import com.briup.bean.SysUser;
import com.briup.common.exception.CrmCommonException;
import com.briup.service.impl.SysUserServiceImpl;
import com.github.pagehelper.PageInfo;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private SysUserServiceImpl userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session) {
		try {
			SysUser user = userService.login(username, password);
			SysRole role = userService.findRoleBySysRoleId(user.getUsrRoleId());
			if(user.getUsrFlag()==1 && role.getRoleFlag()==1) {
				session.setAttribute("user", user);
				session.setAttribute("role", role);
				return "main";
			}
			session.getAttribute("mes");
			return "index";
		} catch (CrmCommonException e) {
			session.setAttribute("mes", e.getMessage());
			e.printStackTrace();
			return "index";
		}
	}
	
	@RequestMapping("/exit")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "index";
	}
	
	@RequestMapping(value="/{curpage}/showAllUser")
	public String showAllUser(@PathVariable int curpage,HttpSession session) {
		try {
			PageInfo<SysUser> pageInfo = userService.findAllSysUser(curpage, 5);
			session.setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "systemset/user_manager";
	}
	
	//跳转增删改界面
	@RequestMapping(value="/want/{operator}/{usrId}")
	public String addUser(@PathVariable String operator, @PathVariable long usrId,HttpSession session,HttpServletRequest request) {	
		if(operator.equals("delete")) {
			try {
				userService.deleteUser(usrId);
				PageInfo<SysUser> pageInfo = userService.findAllSysUser(1, 5);
				session.setAttribute("pageInfo", pageInfo);
			} catch (CrmCommonException e) {
				e.printStackTrace();
			}
			return "systemset/user_manager";
		}
		session.setAttribute("usrId",usrId);
		return "systemset/"+operator;
	}
		
	@RequestMapping(value="/addUserSuccess")
	public String addUserSuccess(SysUser user,HttpSession session) {
		try {
			userService.addUser(user);
			PageInfo<SysUser> pageInfo = userService.findAllSysUser(1, 5);
			session.setAttribute("pageInfo", pageInfo);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "systemset/user_manager";
	}
	
	@RequestMapping(value="/updateUserSuccess")
	public String updateUser(SysUser user,HttpSession session) {
		try {
			userService.updateUser(user);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "redirect:1/showAllUser";
	}
	

}
