package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.FAQ_Dao;
import com.bit.model.FAQ_Dto;


//support- 지원절차
@WebServlet("/home/contactFaq.bit")
public class H_faq_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./contact_faq.jsp");
		rd.forward(req, resp);
	}
}
