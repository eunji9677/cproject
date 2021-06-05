package com.myspring.Billing.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myspring.Billing.List.vo.ListVO;
import com.myspring.Billing.vo.BIllIngVO;
import com.myspring.Requiredamount.vo.RequiredamountVO;

@Repository("billingDAO")
public class BIllIngDAOImpl implements BIllIngDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List selectAllcmList() throws Exception {
		List<BIllIngVO> cmList = sqlSession.selectList("mappers.erp.selectAllcmList");
		return cmList;
	}
	@Override
	public List<ListVO>selectAllBottomList()throws Exception{
		List<ListVO>bottomList = sqlSession.selectList("mappers.erp.selectAllBottomList");
		return bottomList;
	}
	@Override
	public List selectAllMrpaMount() throws Exception{
		List<RequiredamountVO>mrpamount = sqlSession.selectList("mappers.erp.selectAllMrpaMount");
		return mrpamount;
	}
}
