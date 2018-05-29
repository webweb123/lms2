package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Job_ad_Dao;
import com.bit.model.Job_ad_Dto;


//support-±¸ÀÎÀÇ·Ú
@WebServlet("/home/supportAd.bit")

public class H_job_ad_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./support_ad.jsp");
		rd.forward(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Job_ad_Dao dao=new Job_ad_Dao();
		Job_ad_Dto dto=new Job_ad_Dto(); 
		
		dto.setField(req.getParameter("field"));
		dto.setCompany(req.getParameter("company"));
		dto.setEmail(req.getParameter("email"));
		dto.setPhone(req.getParameter("phone"));
		dto.setPay(Integer.parseInt(req.getParameter("pay")));
		
		
		
		
	}
}
