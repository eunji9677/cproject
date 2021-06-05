
<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.commonProduction.commitOperationInstruction.dao.CommitOperationInstructionDAO;
import com.myspring.commonProduction.commitOperationInstruction.vo.CommitOperationInstructionVO;
<<<<<<< HEAD
=======
import com.myspring.commonProduction.operationRegist.dao.OperationRegistDAO;
import com.myspring.commonProduction.operationRegist.vo.OperationRegistVO;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c


@Service("CommonProductionService")
@Transactional(propagation = Propagation.REQUIRED)
public class CommonProductionServiceImpl implements CommonProductionService{
	@Autowired
	private CommitOperationInstructionDAO COIdao;
<<<<<<< HEAD
=======
	@Autowired
	private OperationRegistDAO ORdao;
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
	
	@Override
	public List<CommitOperationInstructionVO> selectAllProductionPlanInfo() throws DataAccessException {
		List<CommitOperationInstructionVO> infolist = null;
		infolist = COIdao.selectAllProductionPlanInfo();
		return infolist;
	}
<<<<<<< HEAD
=======
	
	@Override
	public List<OperationRegistVO> selectAllOperationInfo() throws DataAccessException{
		List<OperationRegistVO> infolist = null;
		infolist = ORdao.selectAllOperationInfo();
		return infolist;
	}
>>>>>>> 9e4a2abb0c9580e94ecd18b28f305eb1db64850c
}
=======
 package com.myspring.commonProduction.service;
 
 import java.util.List;
 
 import org.springframework.beans.factory.annotation.Autowired; import
 org.springframework.dao.DataAccessException; import
  org.springframework.stereotype.Service; import
  org.springframework.transaction.annotation.Propagation; import
  org.springframework.transaction.annotation.Transactional;
  
  import com.myspring.commonProduction.commitOperationInstruction.dao.
  CommitOperationInstructionDAO; import
  com.myspring.commonProduction.commitOperationInstruction.vo.
  CommitOperationInstructionVO; import
  com.myspring.commonProduction.operationRegist.dao.OperationRegistDAO; import
  com.myspring.commonProduction.operationRegist.vo.OperationRegistVO;
  
  
  @Service("CommonProductionService")
  
  @Transactional(propagation = Propagation.REQUIRED) public class
  CommonProductionServiceImpl implements CommonProductionService{
  
  @Autowired private CommitOperationInstructionDAO COIdao;
  
  @Autowired private OperationRegistDAO ORdao;
  
  @Override public List<CommitOperationInstructionVO>
  selectAllProductionPlanInfo() throws DataAccessException {
  List<CommitOperationInstructionVO> infolist = null; infolist =
  COIdao.selectAllProductionPlanInfo(); return infolist; }
  
  @Override public List<OperationRegistVO> selectAllOperationInfo() throws
  DataAccessException{ List<OperationRegistVO> infolist = null; infolist =
  ORdao.selectAllOperationInfo(); return infolist; } }
 
>>>>>>> 454e3966a5685f26b07a4be7e05f09c04fc1add3
