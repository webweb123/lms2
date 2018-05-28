package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Lec_after_Dao;
import com.bit.model.Lec_after_Dto;

public class H_edu_af_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Lec_after_Dao dao=new Lec_after_Dao();
		Lec_after_Dto a = new Lec_after_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Lec_after_Dao dao=new Lec_after_Dao();
	}
}