package com.bit.ctr.A;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Lec_create_Dao;
import com.bit.model.Lec_create_Dto;
import com.bit.model.Staff_Dao;
import com.bit.model.Staff_Dto;

public class A_lec_create_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Staff_Dto a = new Staff_Dto();
		Staff_Dao b = new Staff_Dao();
		Lec_create_Dto c = new Lec_create_Dto();
		Lec_create_Dao d = new Lec_create_Dao();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
