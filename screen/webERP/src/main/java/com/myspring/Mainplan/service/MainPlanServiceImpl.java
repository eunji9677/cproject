package com.myspring.Mainplan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.Mainplan.dao.MainPlanDAO;
import com.myspring.Mainplan.vo.MainPlanVO;

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
}
