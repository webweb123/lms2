package com.bit.ctr.C;

import java.io.IOException;


import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.FAQ_Dao;
import com.bit.model.FAQ_Dto;


//FAQ 페이지 (FAQ 리스트)
public class C_cs_faq_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		FAQ_Dao dao=new FAQ_Dao();
		
		List<FAQ_Dto> list=dao.selectAll();
		
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
