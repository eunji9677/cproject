package com.myspring.commonProduction.operationRegist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.commonProduction.operationRegist.vo.OperationRegistVO;


@Repository("OperationRegistDAO")
public class OperationRegistDAOImpl implements OperationRegistDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllOperationInfo() throws DataAccessException {
		List<OperationRegistVO> infoList = null;
		infoList = sqlSession.selectList("mappers.productionPlan.selectAllOperationRegistInfo");
		return infoList;
	}
}
