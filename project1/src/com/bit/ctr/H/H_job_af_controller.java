package com.bit.ctr.H;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Job_af_Dao;
import com.bit.model.Job_af_Dto;


//community-취업후기
@WebServlet("/home/communityJobAf.bit")
public class H_job_af_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		Job_af_Dao dao = new Job_af_Dao();
		
		List<Job_af_Dto> list=null;
		
		list = dao.selectAll();
		
		req.setAttribute("alist", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("./community_job_af.jsp");
		rd.forward(req, resp);
	}
	
}
