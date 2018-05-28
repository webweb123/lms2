package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Jop_cs_Dao;
import com.bit.model.Jop_cs_Dto;

public class H_job_cs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Jop_cs_Dao dao=new Jop_cs_Dao();
		Jop_cs_Dto a = new Jop_cs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
