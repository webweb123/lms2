package com.bit.ctr.C;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Cs_notice_Dao;
import com.bit.model.Cs_notice_Dto;

//공지사항 상세보기 
public class C_notice_detail_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cs_notice_Dao dao=new Cs_notice_Dao();
		Cs_notice_Dto dto=new Cs_notice_Dto();
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
