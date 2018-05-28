package com.bit.ctr.A;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.App_bbs_stu_Dao;
import com.bit.model.App_bbs_stu_Dto;

public class A_app_stu_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		App_bbs_stu_Dao a = new App_bbs_stu_Dao();
		App_bbs_stu_Dto b = new App_bbs_stu_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
