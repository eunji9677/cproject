package com.myspring.outsourcing_manage.RegOutsourcing.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.myspring.outsourcing_manage.RegOutsourcing.vo.RegOutsourcingVO;

public interface RegOutsourcingDAO {
	 public List viewOutsourcingList() throws DataAccessException;
	 public int insertOutsourcing(RegOutsourcingVO regOutsourcingVO) throws DataAccessException ;
	 public int deleteOutsourcing(int workOrderNumber) throws DataAccessException;
}
