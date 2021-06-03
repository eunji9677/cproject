package com.myspring.MainPlan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.MainPlan.MpsOS.vo.MpsOSVO;
import com.myspring.MainPlan.dao.MainPlanDAO;
import com.myspring.MainPlan.vo.MainPlanVO;

@Service("mainplanService")
@Transactional(propagation = Propagation.REQUIRED)
public class MainPlanServiceImpl implements MainPlanService{
	@Autowired
	private MainPlanDAO mainplanDAO;
	
	@Override
	public List<MainPlanVO>selectAllMainPlanList() throws Exception{
		List<MainPlanVO> mainplanList = mainplanDAO.selectAllMainPlanList();
		return mainplanList;
	}
	
	@Override
	public List<MpsOSVO>selectAllMpsosList()throws Exception{
		List<MpsOSVO>mpsosList = mainplanDAO.selectAllMpsosList();
		return mpsosList;
	}
}
