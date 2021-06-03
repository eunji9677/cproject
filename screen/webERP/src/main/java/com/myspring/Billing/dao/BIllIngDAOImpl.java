package com.myspring.Billing.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.Billing.vo.BIllIngVO;

@Repository("billingDAO")
public class BIllIngDAOImpl implements BIllIngDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllcmList() throws Exception{
		List<BIllIngVO>cmList = sqlSession.selectList("mappers.erp.selectAllcmList");
		return cmList;
}
}
