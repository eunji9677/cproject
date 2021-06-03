package com.myspring.weberp.salesmanage.salesplan.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.weberp.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanService {

	public List listSalesplans() throws DataAccessException;
	public int addSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
	public int addNewSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
	public int removeSalesplan(String Plan_Item_Code) throws DataAccessException;
	public SalesplanVO searchCode(SalesplanVO salesplanVO) throws Exception;
	public SalesplanVO searchName(SalesplanVO salesplanVO) throws Exception;
	public SalesplanVO searchDate(SalesplanVO salesplanVO) throws Exception;

}
