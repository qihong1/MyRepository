package com.briup.web.servlet.shopCar;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Product;
import com.briup.bean.ShopCartItem;
import com.briup.bean.User;
import com.briup.service.IShopCartService;
import com.briup.service.impl.ShopCartServiceImp;
@WebServlet("/toShopCarServlet")
public class toShopCartServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		System.out.println("aaaaaaaaa");
		IShopCartService iscp=new ShopCartServiceImp();
		System.out.println(iscp);
		try {
			
			List<ShopCartItem> allShopCartItem = iscp.findAllProduct(user.getId());
			
			session.setAttribute("allShopCartItem", allShopCartItem);
			System.out.println("aaaaaa");
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("WEB-INF/jsp/shopCart.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
