package com.myspring.Mainplan.MainplanOS.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.Mainplan.MainplanOS.vo.MainPlanOSVO;

@Repository("mainplanosDAO")
public class MainPlanDAOImpl implements MainPlanOSDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllMainPlanOSList() throws Exception{
		List<MainPlanOSVO>mainplanosList = sqlSession.selectList("mapper.mainplanos.selectAllMainPlanOSList");
		return mainplanosList;
	}
}
