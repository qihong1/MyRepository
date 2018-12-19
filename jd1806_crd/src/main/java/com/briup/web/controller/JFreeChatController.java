package com.briup.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.jfree.data.category.CategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.common.exception.CrmCommonException;
import com.briup.common.util.JFreeChartUtil;
import com.briup.service.interf.IReportFormsService;

@Controller
@RequestMapping("/jfreechart")
public class JFreeChatController {

	@Autowired
	private IReportFormsService reportService;
	
	@RequestMapping("/findContribute")//客户贡献
	public String findCstcontribute(String cstname,HttpServletRequest request) {
		try {
			//第一次请求该方法，cstname是空
			CategoryDataset dataset = reportService.findCstcontribute(cstname);
			String fileName = JFreeChartUtil.createBarChart("客户贡献分析表", "客户", "总金额", dataset, request);
			String chartUrl=request.getContextPath()+"/jfreeChart?filename="+fileName;
			request.getSession().setAttribute("chartUrl", chartUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "jfreechart/contr";
	}
	
	@RequestMapping("/findConstract")//客户构成
	public String findCstMakeup(@RequestParam(defaultValue="0",required=false) int condit,HttpServletRequest request) {
		try {
			CategoryDataset dataset = reportService.findCstMakeup(condit);
			String fileName="";
			if(condit==0) {
				fileName=JFreeChartUtil.createBarChart("客户级别百分比表", "客户级别", "百分比", dataset, request);
			}else if(condit==1){
				fileName=JFreeChartUtil.createBarChart("客户信誉度百分比表", "信誉度", "百分比", dataset, request);
			}else if(condit==2){
				fileName=JFreeChartUtil.createBarChart("客户满意度百分比表", "满意度", "百分比", dataset, request);
			}
			String chartUrl=request.getContextPath()+"/jfreeChart?filename="+fileName;
			request.getSession().setAttribute("chartUrl", chartUrl);
		} 
		 catch (Exception e) {
			e.printStackTrace();
		}
		return "jfreechart/cons";
	}
}
