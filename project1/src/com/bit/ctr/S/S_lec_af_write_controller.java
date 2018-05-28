package com.bit.ctr.S;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Lec_after_Dao;
import com.bit.model.Lec_after_Dto;


//수강후기 글쓰기 게시판
public class S_lec_af_write_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Lec_after_Dao dao=new Lec_after_Dao();
		Lec_after_Dto dto=new Lec_after_Dto();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
