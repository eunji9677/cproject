//package com.myspring.search.itemsearch.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.myspring.search.itemsearch.dao.ItemSearchDAO;
//import com.myspring.search.itemsearch.vo.ItemSearchVO;
//
//@Service("itemSearchService")
//@Transactional(propagation = Propagation.REQUIRED)
//public class ItemSearchServiceImpl implements ItemSearchService {
//	
//	@Autowired
//	private ItemSearchDAO itemSearchDAO;
//
//	
//	@Override
//	public List listItemSearchs() throws DataAccessException {
//		List itemSearchsList = null;
//		itemSearchsList = itemSearchDAO.selectAllItemSearchList();
//		
//		return itemSearchsList;
//	}
//
//	@Override
//	public ItemSearchVO searchItem(ItemSearchVO itemSearchVO) throws Exception {
//
//		return itemSearchDAO.searchItem(itemSearchVO);
//	}
//
//}
