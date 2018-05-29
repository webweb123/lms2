package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Job_info_bbs_Dao;
import com.bit.model.Job_info_bbs_Dto;


//support- 취업정보
@WebServlet("/home/supportIf.bit")
public class H_job_info_bbs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./support_if.jsp");
		rd.forward(req, resp);
		Job_info_bbs_Dao dao = new Job_info_bbs_Dao();
		Job_info_bbs_Dto dto =new Job_info_bbs_Dto();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
	}
}