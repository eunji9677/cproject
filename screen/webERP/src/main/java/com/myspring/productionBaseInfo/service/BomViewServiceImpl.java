package com.myspring.productionBaseInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.myspring.productionBaseInfo.BOM.dao.bomViewDAO;
@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)

public class BomViewServiceImpl implements BomViewService{
	@Autowired
	private bomViewDAO bomDAO;
	
	@Override
	public List bomView() throws DataAccessException {
		List bomList = null;
		bomList = bomDAO.viewBOM();
		return bomList;
	}

	@Override
	public List itemView() throws DataAccessException {
		List popList = null;
		popList = bomDAO.viewPop();
		return popList;
	}

}
