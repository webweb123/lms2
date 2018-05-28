package com.bit.ctr.C;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.FAQ_Dao;
import com.bit.model.FAQ_Dto;

public class C_cs_faq_detail_update_controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		FAQ_Dao dao=new FAQ_Dao();
		FAQ_Dto dto=new FAQ_Dto();
	
		
		
	}
}
