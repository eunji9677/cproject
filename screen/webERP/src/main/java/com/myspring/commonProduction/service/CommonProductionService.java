package com.myspring.commonProduction.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;

public interface CommonProductionService {

	public List<CommitOperationInstructionVO> selectAllProductionPlanInfo() throws DataAccessException;

}
