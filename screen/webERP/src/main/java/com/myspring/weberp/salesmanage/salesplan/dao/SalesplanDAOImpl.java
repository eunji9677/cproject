package com.myspring.weberp.salesmanage.salesplan.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.weberp.salesmanage.salesplan.vo.SalesplanVO;

@Repository("salesplanDAO")
public class SalesplanDAOImpl implements SalesplanDAO{

		@Autowired
		private SqlSession sqlSession;


		@Override
		public List selectAllSalesplanList() throws DataAccessException {
			List<SalesplanVO> salesplansList = null;
			salesplansList = sqlSession.selectList("mapper.salesplan.selectAllSalesplanList");
			//mapper.salesplan
			return salesplansList;
		}


		@Override
		public int insertSalesplan(SalesplanVO salesplanVO) throws DataAccessException {
			// /member/addsalesplan.do
			int result = sqlSession.insert("mapper.salesplan.insertSalesplan", salesplanVO);
			return result;
		}

		@Override
		public int insertNewSalesplan(SalesplanVO salesplanVO) throws DataAccessException {
			//수정 데이터
			int result = sqlSession.insert("mapper.salesplan.insertNewSalesplan", salesplanVO);
			return result;
		}


		@Override
		public int deleteSalesplan(String Plan_Item_Code) throws DataAccessException {
			// TODO Auto-generated method stub
			int result = sqlSession.delete("mapper.salesplan.deleteSalesplan", Plan_Item_Code);
			return result;
		}


		@Override
		public SalesplanVO searchByItemCode(SalesplanVO salesplanVO) throws DataAccessException {
			// 품번으로 검색
			SalesplanVO vo = sqlSession.selectOne("mapper.salesplan.SearchByItemCode",salesplanVO);
			return vo;
		}


		@Override
		public SalesplanVO searchByItemName(SalesplanVO salesplanVO) throws DataAccessException {
			// 품명으로 검색
			SalesplanVO vo = sqlSession.selectOne("mapper.salesplan.SearchByItemName",salesplanVO);
			return vo;
		}


		@Override
		public SalesplanVO searchByPlanDate(SalesplanVO salesplanVO) throws DataAccessException {
			// 판매계획 날짜로 검색
			SalesplanVO vo = sqlSession.selectOne("mapper.salesplan.SearchByPlanDate",salesplanVO);
			return vo;
		}


}


