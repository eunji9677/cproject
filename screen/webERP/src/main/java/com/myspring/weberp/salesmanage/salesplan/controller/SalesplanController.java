package com.myspring.weberp.salesmanage.salesplan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.weberp.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanController {

	public ModelAndView listSalesplans(HttpServletRequest request, HttpServletResponse response) throws Exception ;
	public ModelAndView addSalesplan(@ModelAttribute("info")SalesplanVO salesplan,HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView addNewSalesplan(@ModelAttribute("info")SalesplanVO salesplan,HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeSalesplan(@RequestParam("Plan_Item_Code") String Plan_Item_Code, 
	           HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView searchCode(@RequestParam("Plan_Item_Code") String Plan_Item_Code, 
	           HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView searchPrice(@RequestParam("Plan_Unit_Price") int Plan_Unit_Price, 
	           HttpServletRequest request, HttpServletResponse response) throws Exception;
	
//	public ModelAndView searchCode(@ModelAttribute("salesplan") SalesplanVO salesplan,
//            RedirectAttributes rAttr,
//            HttpServletRequest request, HttpServletResponse response) throws Exception;
//	public ModelAndView searchName(@ModelAttribute("salesplan") SalesplanVO salesplan,
//            RedirectAttributes rAttr,
//            HttpServletRequest request, HttpServletResponse response) throws Exception;
//	public ModelAndView searchDate(@ModelAttribute("salesplan") SalesplanVO salesplan,
//            RedirectAttributes rAttr,
//            HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	
}
