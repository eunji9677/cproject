package com.myspring.weberp.outsourcing_manage.RegOutsourcing.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.weberp.outsourcing_manage.RegOutsourcing.vo.RegOutsourcingVO;

@Repository("RegOutsourcingDAO")
public class RegOutsourcingDAOImpl implements RegOutsourcingDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List viewOutsourcingList() throws DataAccessException {
		List<RegOutsourcingVO> outsourcingList = null;
		System.out.println("outsourcingList 전 : " + outsourcingList);
		outsourcingList = sqlSession.selectList("mappers.OutsourcingMapper.selectAllOutsourcingList");
		System.out.println("outsourcingList 후: " + outsourcingList);
		return outsourcingList;
	}

	@Override
	public int insertOutsourcing(RegOutsourcingVO regOutsourcingVO) throws DataAccessException {
		int result = sqlSession.insert("mappers.OutsourcingMapper.insertOutsourcing", regOutsourcingVO);
		return result;
	}

	@Override
	public int deleteOutsourcing(int workOrderNumber) throws DataAccessException {
		int result = sqlSession.delete("mappers.OutsourcingMapper.deleteOutsourcing", workOrderNumber);
		return result;
	}
	
	@Override
	public List viewPop() throws DataAccessException {
		List<RegOutsourcingVO> popList = null;
		popList = sqlSession.selectList("mappers.OutsourcingMapper.selectPopList");
		return popList;
	}
}
