package com.service.impl;

import java.util.List;
import java.util.Map;

import com.dao.AddrDAO;
import com.dao.impl.AddrDAOImpl;
import com.service.AddrService;

public class AddrServiceImpl implements AddrService {
	
	private AddrDAO adao = new AddrDAOImpl();

	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> addr) {
		return adao.selectAddrList(addr);
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> addr) {
		return adao.selectAddr(addr);
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		return adao.insertAddr(addr);
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		return adao.updateAddr(addr);
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		return adao.deleteAddr(addr);
	}

}
