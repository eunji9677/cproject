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
//public class RegItemUnitPriceViewControllerImpl implements RegItemUnitPriceViewController{
//	private static final Logger logger = LoggerFactory.getLogger(RegItemUnitPriceViewControllerImpl.class);
//
//}
//
//
//public class BomViewControllerImpl implements BomViewController {
//	private static final Logger logger = LoggerFactory.getLogger(BomViewControllerImpl.class);
//	@Autowired
//	private BomViewService viewService;
//	@Autowired
//	private bomVO bomVO ;
//	@Override
//	@RequestMapping(value="/member/regbom.do" ,method = RequestMethod.GET)
//	public ModelAndView viewBOM(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String viewName = getViewName(request);
//		List bomView = viewService.bomView();
//		ModelAndView mav = new ModelAndView(viewName);
//		mav.addObject("bomView", bomView);
//		return mav;
//	}
//	@RequestMapping(value="/member/codehelper.do" ,method = RequestMethod.GET)
//	public ModelAndView codeHelper(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String viewName = getViewName(request);
//		List itemView = viewService.itemView();
//		ModelAndView mav = new ModelAndView(viewName);
//		mav.addObject("itemView", itemView);
//		return mav;
//	}
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
//	
//	
//
//}
//
