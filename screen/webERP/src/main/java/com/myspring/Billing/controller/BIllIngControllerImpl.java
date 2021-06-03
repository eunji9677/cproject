package com.myspring.Billing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.Billing.service.BIllIngService;
import com.myspring.Billing.vo.BIllIngVO;

@Controller("billingController")
public class BIllIngControllerImpl implements BIllIngController{
	@Autowired
	private BIllIngService billingService;
	@Autowired
	private BIllIngVO billingVO;
	
	@Override
	@RequestMapping(value="member/regbilling.do", method = RequestMethod.GET)
	public ModelAndView cmList(HttpServletRequest request, HttpServletResponse response)throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		List cmList = billingService.selectAllcmList();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("cmList", cmList);
		return mav;
	}
}
