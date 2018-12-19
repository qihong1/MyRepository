package com.briup.web.servlet.shopCar;

import java.io.IOException;

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
@WebServlet("/addShopCartItemServlet")
public class addShopCartItemServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		IShopCartService iscp=new ShopCartServiceImp();
		try {
			 Product product = (Product)session.getAttribute("product");
			 ShopCartItem sct = iscp.findProduct(product.getId());
			 if(sct==null) {
				 ShopCartItem shopCartItem = new ShopCartItem();
				 shopCartItem.setUser(user);
				 shopCartItem.setProduct(product);
				 Integer number = Integer.parseInt(req.getParameter("num"));
				 System.out.println(number);
				 shopCartItem.setNum(number);
				 session.setAttribute("number", number);
				iscp.addProduct(shopCartItem);
				System.out.println("*********");
			 }else {
				 Integer number = (Integer)session.getAttribute("number");
				 Integer number1 = Integer.parseInt(req.getParameter("num"));
				 number=number+number1;
				 System.out.println(number);
				 iscp.updateShopCartItem(product.getId(), number);
				 session.setAttribute("number", number);
				 System.out.println("///////////");
			 }		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("WEB-INF/jsp/addShopCarSucces.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
