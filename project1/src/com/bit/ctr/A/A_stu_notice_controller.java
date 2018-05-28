package com.bit.ctr.A;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Stu_notice_bbs_Dao;
import com.bit.model.Stu_notice_bbs_Dto;

public class A_stu_notice_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Stu_notice_bbs_Dao a = new Stu_notice_bbs_Dao();
		Stu_notice_bbs_Dto b = new Stu_notice_bbs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
