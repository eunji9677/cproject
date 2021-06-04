package com.myspring.Billing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface BIllIngController {

	ModelAndView cmList(HttpServletRequest request, HttpServletResponse response) throws Exception;

	ModelAndView mrpamount(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
