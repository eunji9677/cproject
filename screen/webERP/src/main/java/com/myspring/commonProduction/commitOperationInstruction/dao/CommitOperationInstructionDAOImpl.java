package com.myspring.commonProduction.commitOperationInstruction.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;

<<<<<<< HEAD
@Repository("CommitOperationInstructionDAOImpl")
=======
@Repository("CommitOperationInstructionDAO")
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
public class CommitOperationInstructionDAOImpl implements CommitOperationInstructionDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllProductionPlanInfo() throws DataAccessException {
		List<CommitOperationInstructionVO> infoList = null;
<<<<<<< HEAD
		infoList = sqlSession.selectList("mappers.productionPlan.selectAllProductionPlanInfo");
=======
		infoList = sqlSession.selectList("mappers.erp.selectAllProductionPlanInfo");
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
		return infoList;
	}
}
