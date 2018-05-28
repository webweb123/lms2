package com.bit.ctr.C;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Online_cs_Dao;
import com.bit.model.Online_cs_Dto;


//온라인 상담 상세페이지 - Online_cs_Dao
public class C_online_cs_detail_controller extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Online_cs_Dao dao=new Online_cs_Dao();
		Online_cs_Dto dto=new Online_cs_Dto();
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
	}
}