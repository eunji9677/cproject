package com.myspring.Requiredamount.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.Requiredamount.service.RequiredamountService;
import com.myspring.Requiredamount.vo.RequiredamountVO;

@Controller("mrpController")
public class RequiredamountControllerImpl implements RequiredamountController{
	@Autowired
	private RequiredamountService mrpService;
	@Autowired
	private RequiredamountVO mrpVO;
	
	@Override
	@RequestMapping(value="member/requiredamount.do", method = RequestMethod.GET)
	public ModelAndView mrpList(HttpServletRequest request, HttpServletResponse response)throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		List mrpList = mrpService.selectAllMrpList();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("mrpList", mrpList);
		return mav;
	}
}
