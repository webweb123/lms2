package com.bit.ctr.T;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Grade_check_Dao;
import com.bit.model.Grade_check_Dto;

public class T_grade_modi_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Grade_check_Dao dao = new Grade_check_Dao();
		Grade_check_Dto a = new Grade_check_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
