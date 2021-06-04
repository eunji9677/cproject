//package com.myspring.invenBasicInfo.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.myspring.invenBasicInfo.service.*;
//import com.myspring.invenBasicInfo.regItemUnitPrice.vo.*;
//
//@Controller("memberController")
////@EnalbleAspectAutoProxy
//public class InvenViewControllerImpl implements InvenViewController{
//	private static final Logger logger = LoggerFactory.getLogger(InvenViewControllerImpl.class);
//	@Autowired
//	private InvenViewService viewService;
//	@Autowired
//	private RegItemUnitPriceVO regItemUnitPriceVO;
//	
//	@Override
//	@RequestMapping(value="/member/itemunitprice.do" ,method = RequestMethod.GET)
//	public ModelAndView viewIUPrice(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mav = null;
//		String viewName = getViewName(request);
//		String number = (String) request.getParameter("itemNumber");
//		if(number == null || number.length() == 0) {
//			mav = new ModelAndView(viewName);
//			return mav;
//		}
//		else {
//			List invenView = viewService.searchView(number);
//			mav = new ModelAndView(viewName);
//			mav.addObject("invenView",invenView);
//		}
//		System.out.println("숫자" + number);
//		return mav;
//	}
//	
//	private String getViewName(HttpServletRequest request) {
//		String contextPath = request.getContextPath();
//		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
//		if (uri == null || uri.trim().equals("")) {
//			uri = request.getRequestURI();
//		}
//
//		int begin = 0;
//		if (!((contextPath == null) || ("".equals(contextPath)))) {
//			begin = contextPath.length();
//		}
//
//		int end;
//		if (uri.indexOf(";") != -1) {
//			end = uri.indexOf(";");
//		} else if (uri.indexOf("?") != -1) {
//			end = uri.indexOf("?");
//		} else {
//			end = uri.length();
//		}
//
//		String viewName = uri.substring(begin, end);
//		if (viewName.indexOf(".") != -1) {
//			viewName = viewName.substring(0, viewName.lastIndexOf("."));
//		}
//		if (viewName.lastIndexOf("/") != -1) {
//			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
//		}
//		return viewName;
//	}
//}