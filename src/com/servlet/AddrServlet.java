package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.Common;
import com.service.AddrService;
import com.service.impl.AddrServiceImpl;

@WebServlet(urlPatterns = "/addr/*")
public class AddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddrService as = new AddrServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = Common.getCmd(request);
		String url = "/views/addr/" + cmd;
		Map<String,String> addr = Common.getSingleMap(request);
		if("list".equals(cmd)) {
			List<Map<String,String>> addrList = as.selectAddrList(addr);
			if(addrList.size()!=0) {
				request.setAttribute("list", addrList);
			}
		} else if("one".equals(cmd)) {
			Map<String,String> address = as.selectAddr(addr);
			if(address.size()!=0) {
				request.setAttribute("one", address);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
