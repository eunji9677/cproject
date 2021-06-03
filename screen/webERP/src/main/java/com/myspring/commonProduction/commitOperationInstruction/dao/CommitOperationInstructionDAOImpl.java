package com.myspring.commonProduction.commitOperationInstruction.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;

@Repository("CommitOperationInstructionDAO")
public class CommitOperationInstructionDAOImpl implements CommitOperationInstructionDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllProductionPlanInfo() throws DataAccessException {
		List<CommitOperationInstructionVO> infoList = null;
		infoList = sqlSession.selectList("mappers.erp.selectAllProductionPlanInfo");
		return infoList;
	}
}
