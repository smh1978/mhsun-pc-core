package org.mhsun.pc.core.service;

import java.util.List;

import org.mhsun.pc.core.mapper.MbgComputerMapper;
import org.mhsun.pc.core.model.MbgComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

//需要加入事务管理
@Transactional(value = "transactionManager", rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED, timeout = 300)
@Service
public class ComputerService {
	
	@Autowired
	private MbgComputerMapper mbgComputerMapper;
	
	//返回所有Computer数组
	public List<MbgComputer> getAllComputers() {
		
		List<MbgComputer> mbgComputerList = mbgComputerMapper.selectByExample(null);
		return mbgComputerList;
	}
	
}
