package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Job_info_bbs_Dao;
import com.bit.model.Job_info_bbs_Dto;

public class H_job_info_bbs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Job_info_bbs_Dao dao = new Job_info_bbs_Dao();
		Job_info_bbs_Dto a =new Job_info_bbs_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}