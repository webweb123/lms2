package com.bit.ctr.C;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.FAQ_Dao;
import com.bit.model.FAQ_Dto;

//faq 상세보기(수정,삭제)
public class C_cs_faq_detail_controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String idx=req.getParameter("idx");
		int sabun=Integer.parseInt(idx);
		
		FAQ_Dao dao=new FAQ_Dao();
		FAQ_Dto dto=dao.selectOne(sabun);
	
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
