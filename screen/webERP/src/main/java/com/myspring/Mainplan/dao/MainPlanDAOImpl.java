package com.myspring.Mainplan.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.Mainplan.vo.MainPlanVO;

@Repository("mainplanDAO")
public class MainPlanDAOImpl implements MainPlanDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllMainPlanList() throws Exception{
		List<MainPlanVO>mainplanList = sqlSession.selectList("mapper.mainplan.selectAllMainPlanList");
		return mainplanList;
	}
}
