package com.myspring.MainPlan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MainPlanController {

	ModelAndView listMainPlan(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
