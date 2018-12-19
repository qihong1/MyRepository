package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Product;
import com.briup.common.exception.ProductException;
import com.briup.service.IProductService;
import com.briup.service.impl.ProductServiceImp;
@WebServlet("/toListServlet")
public class ToListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		IProductService ips = new ProductServiceImp();
		HttpSession session = req.getSession();
		ServletContext application = session.getServletContext();
		try {
			List<Product> productByCategoryDetailId = ips.listProductByCategoryDetailId(Long.parseLong(id));
			application.setAttribute("productByCategoryDetailId", productByCategoryDetailId);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
