package com.bit.ctr.T;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Lec_data_Dao;
import com.bit.model.Lec_data_Dto;

public class T_lec_data_controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Lec_data_Dao dao = new Lec_data_Dao();
		Lec_data_Dto a = new Lec_data_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
