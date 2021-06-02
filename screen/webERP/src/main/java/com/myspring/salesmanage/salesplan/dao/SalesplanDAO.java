package com.myspring.salesmanage.salesplan.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.salesmanage.salesplan.vo.SalesplanVO;

public interface SalesplanDAO {

		public List selectAllSalesplanList() throws DataAccessException; 
		public List selectAllNewSalesplanList() throws DataAccessException; 
//		public int insertSalesplan(SalesplanVO salesplanVO) throws DataAccessException;
//		public int deleteSalesplan(String Plan_Item_Code) throws DataAccessException;
//		public SalesplanVO updateSalesplan(SalesplanVO salesplan) throws DataAccessException;
}

