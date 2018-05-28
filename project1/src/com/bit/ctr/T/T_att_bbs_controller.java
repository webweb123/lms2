package com.bit.ctr.T;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Att_bbs_Dao;
import com.bit.model.Att_bbs_Dto;

public class T_att_bbs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Att_bbs_Dao dao = new Att_bbs_Dao();
		Att_bbs_Dto a = new Att_bbs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
