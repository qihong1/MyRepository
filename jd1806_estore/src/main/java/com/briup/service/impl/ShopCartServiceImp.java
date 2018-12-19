package com.briup.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.OrderLine;
import com.briup.bean.Product;
import com.briup.bean.ShopCartItem;
import com.briup.common.MyBatisSqlSessionFactory;
import com.briup.dao.IShopCartItemDao;
import com.briup.dao.IUserDao;
import com.briup.service.IShopCartService;

public class ShopCartServiceImp implements IShopCartService{
	/*
	 * shopCartItems存储加入到购物车中的产品，key为产品ip，value为订单项（订单项中存在数量）
	 * 注意：购物车中产品登陆之后添加，下次在登陆的时候购物车中没有内容
	 * 购物车存储在session会回，每一个用户登陆到服务器，服务器都会为
	 * 每一个客户端分配一个session对象，session的有效时间30分钟
	 */
	private Map<Long,OrderLine> shopCartItems = new HashMap<Long,OrderLine>();
	
	private static SqlSession session;
	private static IShopCartItemDao mapper;
	static {
		session = MyBatisSqlSessionFactory.openSession();
		 mapper = session.getMapper(IShopCartItemDao.class);
	}
	@Override
	public void addProduct(ShopCartItem item) throws Exception {
		mapper.addProduct(item);
		if(session!=null)session.commit();
	}
	
	@Override
	public List<ShopCartItem> findAllProduct(Long user_id) throws Exception {
		List<ShopCartItem> allProduct = mapper.findAllProduct(user_id);
		return allProduct;
	}

	@Override
	public ShopCartItem findProduct(Long productid) throws Exception {
		ShopCartItem shopcartItem = mapper.findProductExit(productid);
		return shopcartItem;
	}
	
	@Override
	public void updateShopCartItem(Long productid, Integer number) throws Exception {
		mapper.updateShopCartItem(productid, number);
		session.commit();
	}
	
	@Override
	public void removeAllProducts() throws Exception {
	}


	@Override
	public void removeProduct(Long productid) throws Exception {
	}

	@Override
	public void updateProduct(Long productid, Integer number) throws Exception {
	}

	@Override
	public int getShopCartSize() throws Exception {
		return 0;
	}

	

	

	

}
