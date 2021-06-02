package com.myspring.salesmanage.salesplan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanController {

	public ModelAndView listSalesplans(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView listNewSalesplans(HttpServletRequest request, HttpServletResponse response) throws Exception;
//	public ModelAndView addSalesplan(@ModelAttribute("info")SalesplanVO salesplanVO,HttpServletRequest request, HttpServletResponse response) throws Exception;
//	public ModelAndView removeSalesplan(@RequestParam("Plan_Item_Code")String Plan_Item_Code,HttpServletRequest request, HttpServletResponse response) throws Exception;
	//public ModelAndView updateSalesplan(@ModelAttribute("salesplan")SalesplanVO salesplan, RedirectAttributes rAttr,HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
