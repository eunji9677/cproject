//package com.myspring.invenBasicInfo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Propagation;
//
//import com.myspring.invenBasicInfo.regItemUnitPrice.dao.RegItemUnitPriceDAO;
//@Service("memberService")
//@Transactional(propagation = Propagation.REQUIRED)
//
//public class RegItemUnitPriceViewServiceImpl implements RegItemUnitPriceViewService{
//	@Autowired
//	private RegItemUnitPriceDAO regItemUnitPriceDAO;
//	
//	@Override
//	public List viewRegItemUnitPrice() throws DataAccessException{
//		List regItemUnitPriceList = null;
//		regItemUnitPriceList = regItemUnitPriceDAO.viewRegItemUnitPrice();
//		return regItemUnitPriceList;
//	}
//	
//	@Override
//	public List viewPopRegItemUnitPrice() throws DataAccessException{
//		List popRegItemUnitPriceList = null;
//		popRegItemUnitPriceList = regItemUnitPriceDAO.viewPopRegItemUnitPrice();
//		return popRegItemUnitPriceList;
//	}
//}
//
