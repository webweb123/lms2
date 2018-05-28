package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.FAQ_Dao;
import com.bit.model.FAQ_Dto;

public class H_faq_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		FAQ_Dao dao = new FAQ_Dao();
		FAQ_Dto a =new FAQ_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
