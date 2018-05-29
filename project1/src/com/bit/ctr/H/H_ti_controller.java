package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//about-강사 소개
@WebServlet("/home/aboutTi.bit")
public class H_ti_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./about_ti.jsp");
		rd.forward(req, resp);
		
	}
}