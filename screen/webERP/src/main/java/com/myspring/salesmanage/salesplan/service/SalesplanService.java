package com.myspring.salesmanage.salesplan.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanService {

	public List listSalesplans() throws DataAccessException;
	public List listNewSalesplans() throws DataAccessException;
//	public int addSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
//	public int removeSalesplan(String Plan_Item_Code) throws DataAccessException;
//	public SalesplanVO updateNewplan(SalesplanVO salesplanVO) throws Exception;

}
