package com.myspring.weberp.salesmanage.salesplan.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.weberp.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanDAO {

		public List selectAllSalesplanList() throws DataAccessException; 
		public int insertSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
		public int insertNewSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
		public int deleteSalesplan(String Plan_Item_Code) throws DataAccessException;
		public SalesplanVO searchByItemCode(SalesplanVO salesplanVO) throws DataAccessException;
		public SalesplanVO searchByItemName(SalesplanVO salesplanVO) throws DataAccessException;
		public SalesplanVO searchByPlanDate(SalesplanVO salesplanVO) throws DataAccessException;
}

