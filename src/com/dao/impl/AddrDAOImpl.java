package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.DBConnector;
import com.dao.AddrDAO;

public class AddrDAOImpl implements AddrDAO {
	
	private static String selectAddrList = "select rownum as rown, addr.* from " +
			" (select * from address order by ad_num) addr where rownum between 1 and 100";
	private static String selectAddr = "select * from address where ad_num=?";

	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> addr) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(selectAddrList);
			ResultSet rs = ps.executeQuery();
			List<Map<String,String>> addrList = new ArrayList<>();
			while(rs.next()) {
				Map<String,String> address = new HashMap<>();
				address.put("adNum", rs.getString("ad_num"));
				address.put("adCode", rs.getString("ad_code"));
				address.put("adSido", rs.getString("ad_sido"));
				address.put("adGugun", rs.getString("ad_gugun"));
				address.put("adDong", rs.getString("ad_dong"));
				address.put("adLee", rs.getString("ad_lee"));
				address.put("adBunji", rs.getString("ad_bunji"));
				address.put("adHo", rs.getString("ad_ho"));
				address.put("adRoadcode", rs.getString("ad_roadcode"));
				address.put("adIsbase", rs.getString("ad_isbase"));
				address.put("adOrgnum", rs.getString("ad_orgnum"));
				address.put("adSubnum", rs.getString("ad_subnum"));
				address.put("adJinum", rs.getString("ad_jinum"));
				addrList.add(address);
			}
			return addrList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}
	
	@Override
	public Map<String, String> selectAddr(Map<String, String> addr) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(selectAddr);
			ps.setString(1, addr.get("adNum"));
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> address = new HashMap<>();
				address.put("adNum", rs.getString("ad_num"));
				address.put("adCode", rs.getString("ad_code"));
				address.put("adSido", rs.getString("ad_sido"));
				address.put("adGugun", rs.getString("ad_gugun"));
				address.put("adDong", rs.getString("ad_dong"));
				address.put("adLee", rs.getString("ad_lee"));
				address.put("adBunji", rs.getString("ad_bunji"));
				address.put("adHo", rs.getString("ad_ho"));
				address.put("adRoadcode", rs.getString("ad_roadcode"));
				address.put("adIsbase", rs.getString("ad_isbase"));
				address.put("adOrgnum", rs.getString("ad_orgnum"));
				address.put("adSubnum", rs.getString("ad_subnum"));
				address.put("adJinum", rs.getString("ad_jinum"));
				return address;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		return 0;
	}

}
