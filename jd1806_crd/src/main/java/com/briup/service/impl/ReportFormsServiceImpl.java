package com.briup.service.impl;

import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstCustomer;
import com.briup.bean.Orders;
import com.briup.bean.OrdersExample;
import com.briup.bean.OrdersLine;
import com.briup.bean.OrdersLineExample;
import com.briup.bean.OrdersLineExample.Criteria;
import com.briup.common.exception.CrmCommonException;
import com.briup.dao.OrdersLineMapper;
import com.briup.dao.OrdersMapper;
import com.briup.service.interf.ICustomerService;
import com.briup.service.interf.IReportFormsService;
@Service
public class ReportFormsServiceImpl implements IReportFormsService{

	@Autowired
	private  ICustomerService customerService;
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@Autowired
	private OrdersLineMapper orderLineMapper;
	/**
	 * 客户贡献
	 */
	public CategoryDataset findCstcontribute(String cust_name) throws Exception {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//判空处理，第一次进入客户贡献分析没有传名字参数，在输入名字搜索才会传参
		if(StringUtils.isBlank(cust_name)) {
			List<CstCustomer> allCustomer = customerService.findAllCustomer();
			for (CstCustomer cstCustomer : allCustomer) {
				//dataset三个参数分别表示柱状图数据（总花费金额）、X轴、Y轴
				dataset.addValue(getTotlePrice(cstCustomer.getCustName()),cstCustomer.getCustName(), cstCustomer.getCustName());
			}
		}else {
			dataset.addValue(getTotlePrice(cust_name),cust_name,cust_name);		
		}
		return dataset;
	}

	/**
	 * 客户构成
	 */
	public CategoryDataset findCstMakeup(int condit) throws CrmCommonException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//所有的客户人数
		int i = customerService.findAllCustomer().size();
		//condit：0表示客户级别,1表示信誉度，2表示满意度
		if(condit==0) {
			Set<String> levelLable = customerService.findAllCustomerLevelLable();
			for (String str : levelLable) {
				List<CstCustomer> list = customerService.findCstCustomerByLevelLable(str);
				//对应级别客户的人数
				int j = list.size();
				double percent=(double)j/i;
				dataset.addValue(percent, str, "");
			}
		}else if(condit==1) {
			Set<Integer> credit = customerService.findAllCustomerCredit();
			for (Integer integer : credit) {
				List<CstCustomer> list = customerService.findCstCustomerByCredit(integer);
				//对应信誉度的人数
				int j = list.size();
				double percent=(double)j/i;
				if(integer==0) {
					dataset.addValue(percent,"信誉差",integer);
				}else if(integer==1) {
					dataset.addValue(percent,"信誉良好",integer);
				}else if(integer==2) {
					dataset.addValue(percent,"信誉优秀",integer);
				}else if(integer==3) {
					dataset.addValue(percent,"信誉极佳",integer);
				}
			}
		}else if(condit==2) {
			Set<Integer> satisfy = customerService.findAllCustomerSatisfy();
			for (Integer integer : satisfy) {
				List<CstCustomer> list = customerService.findCstCustomerBySatisfy(integer);
				//对应满意度的人数
				int j = list.size();
				double percent=(double)j/i;
				if(integer==0) {
					dataset.addValue(percent,"不满意",integer);
				}else if(integer==1) {
					dataset.addValue(percent,"比较满意",integer);
				}else if(integer==2) {
					dataset.addValue(percent,"满意",integer);
				}else if(integer==3) {
					dataset.addValue(percent,"很满意",integer);
				}
			}
			
		}
		return dataset;
	}

	/**
	 * 用来求用户所有定单的总花费
	 */
	public double getTotlePrice(String custName) {
		int sum=0;
		try {
			CstCustomer customer = customerService.findCustomerByCstName(custName);
			OrdersExample example = new OrdersExample();
			example.createCriteria().andOdrCustIdEqualTo(customer.getCustId());
			List<Orders> list = ordersMapper.selectByExample(example);
			OrdersLineExample example2 = new OrdersLineExample();
			Criteria criteria = example2.createCriteria();
			for (Orders order : list) {
				criteria.andOddOrderIdEqualTo(order.getOdrId());
				List<OrdersLine> list2 = orderLineMapper.selectByExample(example2);
				for (OrdersLine ordersLine : list2) {
					sum+=ordersLine.getOddPrice();
				}
			}
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return sum;
	}
}
