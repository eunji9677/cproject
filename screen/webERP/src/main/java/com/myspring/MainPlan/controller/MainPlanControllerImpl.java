package com.myspring.MainPlan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.MainPlan.service.MainPlanService;
import com.myspring.MainPlan.vo.MainPlanVO;

@Controller("mainplanController")
public class MainPlanControllerImpl implements MainPlanController{
	private static final Logger logger = LoggerFactory.getLogger(MainPlanControllerImpl.class);
	@Autowired
	private MainPlanService mainplanService;
	@Autowired
	private MainPlanVO mainplanVO;
	
	@Override
	@RequestMapping(value="member/mainplan.do", method = RequestMethod.GET)
	public ModelAndView listMainPlan(HttpServletRequest request, HttpServletResponse response)throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		List mainplanList = mainplanService.selectAllMainPlanList();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("mainplanList", mainplanList);
		return mav;
	}
	
	@RequestMapping(value="member/applyorder.do", method=RequestMethod.GET)
	public ModelAndView MpsOSList(HttpServletRequest request, HttpServletResponse response)throws Exception{
		String viewName = (String)request.getAttribute("viewName");
		List mpsosList = mainplanService.selectAllMpsosList();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("mpsosList", mpsosList);
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
