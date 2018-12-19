package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Product;
import com.briup.common.exception.ProductException;
import com.briup.service.impl.ProductServiceImp;
@WebServlet("/bookShowViewServlet")
public class BookShowViewServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		ProductServiceImp psi = new ProductServiceImp();
		try {
			Product product = psi.getProductById(Long.parseLong(id));
			HttpSession session = req.getSession();
			session.setAttribute("product", product);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ProductException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/WEB-INF/jsp/bookShowView.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
