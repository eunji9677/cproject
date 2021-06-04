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
		List bottomList = billingService.selectAllBottomList();
		mav.addObject("bottomList", bottomList);
		return mav;
	}
	@Override
	@RequestMapping(value="member/mrpamount.do", method=RequestMethod.GET)
	public ModelAndView mrpamount(HttpServletRequest request, HttpServletResponse response)throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		List mrpamount = billingService.selectAllMrpaMount();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("mrpamount", mrpamount);
		return mav;
	}
		
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}
}
