package com.myspring.Requiredamount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.Requiredamount.dao.RequiredamountDAO;
import com.myspring.Requiredamount.vo.RequiredamountVO;

@Service("mrpService")
@Transactional(propagation = Propagation.REQUIRED)
public class RequiredamountServiceImpl implements RequiredamountService{
	@Autowired
	private RequiredamountDAO mrpDAO;
	
	@Override
	public List<RequiredamountVO>selectAllMrpList() throws Exception{
		List<RequiredamountVO>mrpList = mrpDAO.selectAllMrpList();
		return mrpList;
	}
}
