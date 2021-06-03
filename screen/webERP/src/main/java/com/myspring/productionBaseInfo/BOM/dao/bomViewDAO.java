package com.myspring.productionBaseInfo.BOM.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface bomViewDAO {
	public List viewBOM() throws DataAccessException;

	public List viewPop() throws DataAccessException;
}
