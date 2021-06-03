package com.myspring.productionBaseInfo.BOM.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.productionBaseInfo.BOM.vo.bomVO;
import com.myspring.productionBaseInfo.service.BomViewService;

@Repository("bomViewDAO")
public class bomViewDAOImpl implements bomViewDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List viewBOM() throws DataAccessException {
		List<bomVO> bomList = null;
		System.out.println("다오 시작 : " + bomList);
		bomList = sqlSession.selectList("mappers.BOMMapper.selectAllMemberList");
		System.out.println("다오 종료 : " + bomList);
		return bomList;
	}

	@Override
	public List viewPop() throws DataAccessException {
		List<bomVO> popList = null;
		popList = sqlSession.selectList("mappers.BOMMapper.selectPopList");
		return popList;
	}

	@Override
	public List setText(String itemNumber) throws DataAccessException {
		List<bomVO> textList = null;
		textList = sqlSession.selectList("mappers.BOMMapper.selectitem",itemNumber);
		return textList;
	}
	@Override
	public List SearchView(String itemNumber) throws DataAccessException{
		List<bomVO> searchList = null;
		searchList = sqlSession.selectList("mappers.BOMMapper.searchitem",itemNumber);
		return searchList;
	}
	
}
