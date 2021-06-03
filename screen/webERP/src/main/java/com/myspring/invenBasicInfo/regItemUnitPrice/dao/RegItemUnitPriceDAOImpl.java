//package com.myspring.invenBasicInfo.regItemUnitPrice.dao;
//
//import java.util.List;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Repository;
//
//import com.myspring.invenBasicInfo.regItemUnitPrice.vo.RegItemUnitPriceVO;
//
//@Repository("RegItemUnitPriceDAO")
//public class RegItemUnitPriceDAOImpl implements RegItemUnitPriceDAO{
//	@Autowired
//	private SqlSession sqlSession;
//	
//	@Override
//	public List viewRegItemUnitPrice() throws DataAccessException{
//		List<RegItemUnitPriceVO> regItemUnitPriceList = null;
//		System.out.println("다오 시작 : " + regItemUnitPriceList);
//		regItemUnitPriceList = sqlSession.selectList("mappers.BOMMapper.selectAllMemberList");
//		System.out.println("다오 종료 : " + regItemUnitPriceList);
//		return regItemUnitPriceList;
//	}
//	
//	@Override
//	public List viewPopRegItemUnitPrice() throws DataAccessException{
//		List<RegItemUnitPriceVO> popRegItemUnitPriceList = null;
//		popRegItemUnitPriceList = sqlSession.selectList("mappers.BOMMapper.selectAllMemberList");
//		return popRegItemUnitPriceList;
//	}
//}
//
