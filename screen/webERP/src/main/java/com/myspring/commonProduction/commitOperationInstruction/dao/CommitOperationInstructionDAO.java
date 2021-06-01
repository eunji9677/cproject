package com.myspring.commonProduction.commitOperationInstruction.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface CommitOperationInstructionDAO {
	
	public List selectAllProductionPlanInfo() throws DataAccessException;

}
