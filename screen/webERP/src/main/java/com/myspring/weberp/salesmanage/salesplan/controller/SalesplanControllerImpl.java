//package com.myspring.weberp.salesmanage.salesplan.controller;
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
//import com.myspring.weberp.salesmanage.salesplan.service.SalesplanService;
//import com.myspring.weberp.salesmanage.salesplan.vo.SalesplanVO;
//
//@Controller("salesplanController")
////@EnavleAspectJAutoProxy
//public class SalesplanControllerImpl implements SalesplanController {
//
//	private static final Logger logger = LoggerFactory.getLogger(SalesplanControllerImpl.class);
//	@Autowired(required=false)
//	private SalesplanService salesplanService;
//	@Autowired(required=false)
//	private SalesplanVO salesplanVO;
//	
//	@Override
//	@RequestMapping(value="/member/regsalesplan.do", method= RequestMethod.GET)//jsp에서 받아올 맵핑값
//	public ModelAndView listSalesplans(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String viewName = getViewName(request);
//		System.out.println("viewName: " +viewName);
//		logger.info("viewName:" +viewName);
//		logger.debug("viewName: "+viewName);
//		List salesplansList = salesplanService.listSalesplans();
//		ModelAndView mav = new ModelAndView(viewName);
//		mav.addObject("salesplansList",salesplansList);
//		return mav;
//	}//mapper.salesplan.
//
//
//
//
//	@Override
//	@RequestMapping(value="/member/addsalesplan.do", method=RequestMethod.POST)
//	public ModelAndView addSalesplan(@ModelAttribute("info")SalesplanVO salesplan,HttpServletRequest request, HttpServletResponse response) throws Exception{
//		
//		request.setCharacterEncoding("utf-8");
//		int result =0;
//		result = salesplanService.addSalesplan(salesplan);
//		ModelAndView mav = new ModelAndView("redirect:/salesplan/listSalesplans.do");
//		return mav;
//	}
//
//
//	@Override
//	public ModelAndView addNewSalesplan(SalesplanVO salesplan, HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		request.setCharacterEncoding("utf-8");
//		int result =0;
//		result = salesplanService.addNewSalesplan(salesplan);
//		ModelAndView mav = new ModelAndView("redirect:/salesplan/listSalesplans.do");
//		return mav;
//	}
//	
//	@RequestMapping(value="/salesplan/removeSalesplan.do", method=RequestMethod.GET)
//	public ModelAndView removeSalesplan(@RequestParam("Plan_Item_Code")String Plan_Item_Code,
//			HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
//		salesplanService.removeSalesplan(Plan_Item_Code);
//		ModelAndView mav = new ModelAndView("redirect:/salesplan/listSalesplans.do");
//		return mav;
//	}//주석처리
//
//	
//	@RequestMapping(value = "/salesplan/*Form.do", method =  RequestMethod.GET)
//	private ModelAndView form(@RequestParam(value= "result", required=false) String result,
//						       HttpServletRequest request, 
//						       HttpServletResponse response) throws Exception {
//		//String viewName = getViewName(request);
//		String viewName = (String)request.getAttribute("viewName");
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("result",result);
//		mav.setViewName(viewName);
//		return mav;
//	}
//
//
//
//
//
////	@Override
////	@RequestMapping(value="/member/searchcode.do", method=RequestMethod.GET)
////	public ModelAndView searchCode(@ModelAttribute("salesplan") SalesplanVO salesplan,
//////            RedirectAttributes rAttr,
////            HttpServletRequest request, HttpServletResponse response) throws Exception{
////		
//////		List myOrderList=new ArrayList<OrderVO>();
//////		myOrderList.add(orderVO);
//////
//////		MemberVO memberInfo=(MemberVO)session.getAttribute("memberInfo");
//////		
//////		session.setAttribute("myOrderList", myOrderList);
//////		session.setAttribute("orderer", memberInfo);
////		//		return mav;
////		
////		
//////		// TODO Auto-generated method stub
////		ModelAndView mav = new ModelAndView();
////		salesplanVO = salesplanService.searchCode(salesplan);
////		if(salesplanVO !=null) {
////			HttpSession session = request.getSession();
////			session.setAttribute("salesplan", salesplanVO);
////			session.setAttribute("isLogOn", true);
////			String action = (String) session.getAttribute("action");
////			session.removeAttribute("action");
////			if(action!= null) {
////				mav.setViewName("redirect:"+action);
////			}else {
////				mav.setViewName("redirect:/member/regsalesplan.do");//수정해야함
////			}
////			
////		}else {
////			rAttr.addAttribute("result", "nothing");
//////			   mav.setViewName("redirect:/member/loginForm.do");
////		}
////		return mav;
////	}
////
////
////
////
////	@Override
////	@RequestMapping(value="/member/searchname.do", method=RequestMethod.GET)
////	public ModelAndView searchName(SalesplanVO salesplan, RedirectAttributes rAttr, HttpServletRequest request,
////			HttpServletResponse response) throws Exception {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////
////
////
////	@Override
////	@RequestMapping(value="/member/searchdate.do", method=RequestMethod.GET)
////	public ModelAndView searchDate(SalesplanVO salesplan, RedirectAttributes rAttr, HttpServletRequest request,
////			HttpServletResponse response) throws Exception {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//
//	private String getViewName(HttpServletRequest request)  throws Exception{
//		String contextPath = request.getContextPath();
//	String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
//	if (uri == null || uri.trim().equals("")) {
//		uri = request.getRequestURI();
//	}
//
//	int begin = 0;
//	if (!((contextPath == null) || ("".equals(contextPath)))) {
//		begin = contextPath.length();
//	}
//
//	int end;
//	if (uri.indexOf(";") != -1) {
//		end = uri.indexOf(";");
//	} else if (uri.indexOf("?") != -1) {
//		end = uri.indexOf("?");
//	} else {
//		end = uri.length();
//	}
//	String viewName = uri.substring(begin, end);
//	if (viewName.indexOf(".") != -1) {
//		viewName = viewName.substring(0, viewName.lastIndexOf("."));
//	}
//	if (viewName.lastIndexOf("/") != -1) {
//		viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
//	}
//	return viewName;
//}
//
//
//
//
//}
