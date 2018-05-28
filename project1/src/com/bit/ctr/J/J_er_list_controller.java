package com.bit.ctr.J;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Job_ad_Dto;
import com.bit.model.Job_ad_Dao;

public class J_er_list_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Job_ad_Dao a = new Job_ad_Dao();
		Job_ad_Dto b = new Job_ad_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
