package com.myspring.MainPlan.service;

import java.util.List;

import com.myspring.MainPlan.MpsOS.vo.MpsOSVO;
import com.myspring.MainPlan.vo.MainPlanVO;

public interface MainPlanService {
	List<MainPlanVO> selectAllMainPlanList() throws Exception;

	List<MpsOSVO> selectAllMpsosList() throws Exception;

}
