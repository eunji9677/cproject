package com.myspring.Requiredamount.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.Requiredamount.vo.RequiredamountVO;

@Repository("mrpDAO")
public class RequiredamountDAOImpl implements RequiredamountDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllMrpList() throws Exception{
		List<RequiredamountVO>mrpList = sqlSession.selectList("mappers.erp.selectAllMrpList");
		return mrpList;
}
}
