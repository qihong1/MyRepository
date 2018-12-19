package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.service.impl.UserServiceImp;
@WebServlet("/updateUserInFoServlet")
public class UpadateUserInFoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String password = req.getParameter("password");
		String zip = req.getParameter("zip");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		user.setPassword(password);
		user.setZip(zip);
		user.setAddress(address);
		user.setPhone(phone);
		user.setEmail(email);
		session.setAttribute("user", user);
		UserServiceImp usi = new UserServiceImp();
		try {
			usi.updateUserInfo(user);
			resp.sendRedirect("updateSuccess.jsp");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
