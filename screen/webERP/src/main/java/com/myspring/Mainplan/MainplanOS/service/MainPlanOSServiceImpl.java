package com.myspring.Mainplan.MainplanOS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.Mainplan.MainplanOS.dao.MainPlanOSDAO;
import com.myspring.Mainplan.MainplanOS.vo.MainPlanOSVO;


@Service("mainplanosService")
@Transactional(propagation = Propagation.REQUIRED)
public class MainPlanOSServiceImpl implements MainPlanOSService{
	@Autowired
	private MainPlanOSDAO mainplanosDAO;
	
	@Override
	public List<MainPlanOSVO>selectAllMainPlanOSList() throws Exception{
		List<MainPlanOSVO> mainplanosList = mainplanosDAO.selectAllMainPlanOSList();
		return mainplanosList;
	}
}
