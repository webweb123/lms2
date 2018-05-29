package com.bit.ctr.H;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Lec_after_Dao;
import com.bit.model.Lec_after_Dto;


//community-±³À°ÈÄ±â
@WebServlet("/home/community.bit")
public class H_edu_af_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
		Lec_after_Dao dao=new Lec_after_Dao();

		List<Lec_after_Dto> list=null;
		
		list=dao.selectAll();
		
		req.setAttribute("alist", list);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("./community.jsp");
		rd.forward(req, resp);
	}
}