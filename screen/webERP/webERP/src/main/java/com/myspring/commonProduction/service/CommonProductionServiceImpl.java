package com.myspring.commonProduction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.commonProduction.commitOperationInstruction.dao.CommitOperationInstructionDAO;
import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;


@Service("CommonProductionService")
@Transactional(propagation = Propagation.REQUIRED)
public class CommonProductionServiceImpl implements CommonProductionService{
	@Autowired
	private CommitOperationInstructionDAO COIdao;
	
	@Override
	public List<CommitOperationInstructionVO> selectAllProductionPlanInfo() throws DataAccessException {
		List<CommitOperationInstructionVO> infolist = null;
		infolist = COIdao.selectAllProductionPlanInfo();
		return infolist;
	}
}
