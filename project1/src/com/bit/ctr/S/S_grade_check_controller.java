package com.bit.ctr.S;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Grade_check_Dao;
import com.bit.model.Grade_check_Dto;

//성적확인
public class S_grade_check_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Grade_check_Dao dao=new Grade_check_Dao();
		Grade_check_Dto dto=new Grade_check_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}