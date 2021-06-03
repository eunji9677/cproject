package com.myspring.Billing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.Billing.dao.BIllIngDAO;
import com.myspring.Billing.vo.BIllIngVO;

@Service("billingService")
@Transactional(propagation = Propagation.REQUIRED)
public class BIllIngServiceImpl implements BIllIngService{
	@Autowired
	private BIllIngDAO billingDAO;
	
	@Override
	public List<BIllIngVO>selectAllcmList() throws Exception{
		List<BIllIngVO>cmList = billingDAO.selectAllcmList();
		return cmList;
	}
}
