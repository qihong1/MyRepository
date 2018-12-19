package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Category;
import com.briup.bean.CategoryDetail;
import com.briup.bean.Product;
import com.briup.bean.User;
import com.briup.common.exception.ProductException;
import com.briup.common.exception.UserException;
import com.briup.service.ICategoryDetailService;
import com.briup.service.ICategoryService;
import com.briup.service.IProductService;
import com.briup.service.IUserService;
import com.briup.service.impl.CategoryDetailServiceImp;
import com.briup.service.impl.CategoryServiceImp;
import com.briup.service.impl.ProductServiceImp;
import com.briup.service.impl.UserServiceImp;
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		IUserService usi = new UserServiceImp();
		try {
			User user = usi.loginUser(username, password);
			HttpSession session = req.getSession();
			ServletContext application = session.getServletContext();
					
			IProductService ips= new ProductServiceImp();
			ICategoryService icg=new CategoryServiceImp();
			List<Category> categoryList = icg.listCategory();			
			application.setAttribute("categoryList", categoryList);
			ICategoryDetailService ids=new CategoryDetailServiceImp();
			Map<Category, List<CategoryDetail>> map = ids.listCategoryDetail();
			application.setAttribute("map", map);
			
			List<Product> productList=null;
			try {
				productList = ips.listProduct();
			} catch (ProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			application.setAttribute("productList", productList);
			session.setAttribute("username", username);
			session.setAttribute("user", user);
			resp.sendRedirect("toIndexSuccessServlet");	
		} catch (UserException e) {
			e.printStackTrace();
			//弹出用户名或密码错误的弹框
			req.getRequestDispatcher("failed.html").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
