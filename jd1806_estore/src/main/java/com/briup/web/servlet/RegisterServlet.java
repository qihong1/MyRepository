package com.briup.web.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.service.IUserService;
import com.briup.service.impl.UserServiceImp;


@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String zip = req.getParameter("zip");
		String address = req.getParameter("address");
		String telephone = req.getParameter("telephone");
		String email = req.getParameter("email");
		User user = new User(name,password,zip,address,telephone,email);
		user.setDob(new Date());
		IUserService usi = new UserServiceImp();
		try {
			usi.registerUser(user);
			resp.sendRedirect("toLoginServlet");
		} catch (UserException e) {
			//跳转一个用户已存在的弹框
			req.getRequestDispatcher("registerFailed.html").forward(req, resp);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
