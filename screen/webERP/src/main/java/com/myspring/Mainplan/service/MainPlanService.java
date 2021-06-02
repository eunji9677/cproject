package com.myspring.Mainplan.service;

import java.util.List;

import com.myspring.Mainplan.vo.MainPlanVO;

public interface MainPlanService {
	List<MainPlanVO> selectAllMainPlanList() throws Exception;

}
