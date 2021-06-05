
<<<<<<< HEAD
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;
<<<<<<< HEAD
=======
import com.myspring.commonProduction.operationRegist.vo.OperationRegistVO;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c

public interface CommonProductionService {

	public List<CommitOperationInstructionVO> selectAllProductionPlanInfo() throws DataAccessException;
<<<<<<< HEAD
=======
	public List<OperationRegistVO> selectAllOperationInfo() throws DataAccessException;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c

}
=======
 package com.myspring.commonProduction.service;
  
  import java.util.List;
  
  import org.springframework.dao.DataAccessException;
  
  import com.myspring.commonProduction.commitOperationInstruction.vo.
  CommitOperationInstructionVO; import
  com.myspring.commonProduction.operationRegist.vo.OperationRegistVO;
  
  public interface CommonProductionService {
  
  public List<CommitOperationInstructionVO> selectAllProductionPlanInfo()
  throws DataAccessException; public List<OperationRegistVO>
  selectAllOperationInfo() throws DataAccessException;
  
  }
 
>>>>>>> 454e3966a5685f26b07a4be7e05f09c04fc1add3
