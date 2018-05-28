package com.bit.ctr.S;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Free_bbs_Dao;
import com.bit.model.Free_bbs_Dto;

//자유게시판
public class S_free_bbs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Free_bbs_Dao dao=new Free_bbs_Dao();
		Free_bbs_Dto dto=new Free_bbs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}