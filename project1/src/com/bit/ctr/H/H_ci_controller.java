package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//About us-센터소개
@WebServlet("/home/aboutCi.bit")
public class H_ci_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./about_ci.jsp");
		rd.forward(req, resp);
	}
}
