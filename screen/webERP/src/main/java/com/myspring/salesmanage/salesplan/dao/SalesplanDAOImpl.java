package com.myspring.salesmanage.salesplan.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.salesmanage.salesplan.vo.SalesplanVO;

@Repository("salesplanDAO")
public class SalesplanDAOImpl implements SalesplanDAO{

		@Autowired
		private SqlSession sqlSession;


		@Override
		public List selectAllSalesplanList() throws DataAccessException {
			List<SalesplanVO> salesplansList = null;
			salesplansList = sqlSession.selectList("mapper.selectAllSalesplanList");
			//sales_manage.reg_salesplan.
			return salesplansList;
		}


		@Override
		public List selectAllNewSalesplanList() throws DataAccessException {
			List<SalesplanVO> newsalesList = null;
			newsalesList = sqlSession.selectList("mapper.selectAllNewSalesplanList");
			//sales_manage.reg_salesplan.
			return newsalesList;
		}



}


