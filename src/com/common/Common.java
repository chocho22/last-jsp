package com.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Common {
	
	private static final String RESULT_PATH = "/views/msg/result";
	
	public static String getCmd(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String cmd = request.getParameter("cmd");
		if(cmd==null) {
			cmd = uri.substring(uri.lastIndexOf("/")+1);
		}
		return cmd;
	}
	
	public static Map<String,String> getSingleMap(HttpServletRequest request) {
		Map<String,String> pMap = new HashMap<>();
		Map<String,String[]> rMap = request.getParameterMap();
		Iterator<String> it = rMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			pMap.put(key, rMap.get(key)[0]);
		}
		return pMap;
	}
	
	public static void goResultPage(HttpServletRequest request, HttpServletResponse response, String msg, String url) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(RESULT_PATH);
		request.setAttribute("url", url);
		request.setAttribute("msg", msg);
		rd.forward(request, response);
	}
	
	public static void goPage(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
	
}
