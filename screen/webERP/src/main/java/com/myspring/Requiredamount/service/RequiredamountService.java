package com.myspring.Requiredamount.service;

import java.util.List;

import com.myspring.Requiredamount.vo.RequiredamountVO;

public interface RequiredamountService {

	List<RequiredamountVO> selectAllMrpList() throws Exception;

}
