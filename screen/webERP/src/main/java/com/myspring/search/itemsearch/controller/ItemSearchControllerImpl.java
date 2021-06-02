//package com.myspring.search.itemsearch.controller;
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
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.myspring.search.itemsearch.service.ItemSearchService;
//import com.myspring.search.itemsearch.vo.ItemSearchVO;
//
//@Controller("itemSearchController")
//public class ItemSearchControllerImpl implements ItemSearchController{
//	
//	private static final Logger logger = LoggerFactory.getLogger(ItemSearchControllerImpl.class);
//	
//	@Autowired
//	private ItemSearchService itemSearchService;
//	
//	@Autowired
//	private ItemSearchVO itemSearchVO;
//
//	@Override
//	@RequestMapping(value="/itemSearch/listItemSearchs.do", method = RequestMethod.GET)
//	public ModelAndView listItemSearchs(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		String viewName = (String)request.getAttribute("viewName");
//		List itemSearchsList = itemSearchService.listItemSearchs(); 
//		ModelAndView mav = new ModelAndView(viewName);
//		mav.addObject("itemSearchsList", itemSearchsList);
//		return mav;
//	}
//
//	@Override
//	@RequestMapping(value="/itemSearch/searchItem.do", method = RequestMethod.POST)
//	public ModelAndView searchItem(@ModelAttribute("itemSearch") ItemSearchVO itemSearch,
//            RedirectAttributes rAttr,
//            HttpServletRequest request, HttpServletResponse response) throws Exception{
//		ModelAndView mav = new ModelAndView();
//		itemSearchVO = itemSearchService.searchItem(itemSearch);
//		if(itemSearchVO !=null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("itemSearch", itemSearchVO);
//			session.setAttribute("isLogOn", true);
//			mav.setViewName("redirect:/itemSearch/listItemSearchs.do");
//		}else {
//			rAttr.addAttribute("result","searchFailed");
//			mav.setViewName("redirect:/itemSearch/searchForm.do");
//		}
//		
//		return mav;
//	}
//
////	private String getViewName(HttpServletRequest request) throws Exception {
////		String contextPath = request.getContextPath();
////		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
////		if (uri == null || uri.trim().equals("")) {
////			uri = request.getRequestURI();
////		}
////
////		int begin = 0;
////		if (!((contextPath == null) || ("".equals(contextPath)))) {
////			begin = contextPath.length();
////		}
////
////		int end;
////		if (uri.indexOf(";") != -1) {
////			end = uri.indexOf(";");
////		} else if (uri.indexOf("?") != -1) {
////			end = uri.indexOf("?");
////		} else {
////			end = uri.length();
////		}
////
////		String viewName = uri.substring(begin, end);
////		if (viewName.indexOf(".") != -1) {
////			viewName = viewName.substring(0, viewName.lastIndexOf("."));
////		}
////		if (viewName.lastIndexOf("/") != -1) {
////			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
////		}
////		return viewName;
////		
////	}
//}
