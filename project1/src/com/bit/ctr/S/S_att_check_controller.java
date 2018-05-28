package com.bit.ctr.S;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Att_bbs_Dao;
import com.bit.model.Att_bbs_Dto;

//출석확인!
public class S_att_check_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Att_bbs_Dao dao=new Att_bbs_Dao();
		Att_bbs_Dto dto=new Att_bbs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
	}
}