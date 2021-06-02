//package com.myspring.search.itemsearch.dao;
//
//import java.util.List;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Repository;
//
//import com.myspring.search.itemsearch.vo.ItemSearchVO;
//
//@Repository("itemSearchDAO")
//public class ItemSearchDAOImpl implements ItemSearchDAO{
//
//	@Autowired
//	private SqlSession sqlSession;
//
//	@Override
//	public List selectAllItemSearchList() throws DataAccessException {
//		List<ItemSearchVO> itemSearchsList = null;
//		itemSearchsList = sqlSession.selectList("mapper.itemSearch.selectAllItemSearchList");
//		return itemSearchsList;
//	}
//
//	@Override
//	public ItemSearchVO searchItem(ItemSearchVO itemSearchVO) throws DataAccessException {
//		ItemSearchVO vo = sqlSession.selectOne("mapper.itemSearch.searchItem", itemSearchVO);
//		return vo;
//	}
//
//}
