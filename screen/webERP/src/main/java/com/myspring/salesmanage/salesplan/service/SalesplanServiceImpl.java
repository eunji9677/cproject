package com.myspring.salesmanage.salesplan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.salesmanage.salesplan.dao.SalesplanDAO;
import com.myspring.salesmanage.salesplan.vo.SalesplanVO;


@Service("salesplanService")
@Transactional(propagation = Propagation.REQUIRED)
public class SalesplanServiceImpl implements SalesplanService{

	@Autowired
	private SalesplanDAO salesplanDAO;

	@Override
	public List listSalesplans() throws DataAccessException {
		// 수정이 없는 계획
		List salesplansList = null;
		salesplansList = salesplanDAO.selectAllSalesplanList();
		return salesplansList;
	}
	
	@Override
	public List listNewSalesplans() throws DataAccessException {
		//수정 후 계획
		List salesplansList = null;
		salesplansList = salesplanDAO.selectAllNewSalesplanList();
		return salesplansList;
	}

//	@Override
//	public int addSalesplan(SalesplanVO salesplanVO) throws DataAccessException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int removeSalesplan(String Plan_Item_Code) throws DataAccessException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public SalesplanVO updateNewplan(SalesplanVO salesplanVO) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}




}
