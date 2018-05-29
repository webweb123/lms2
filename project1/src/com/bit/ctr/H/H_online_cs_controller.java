package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Online_cs_Dao;
import com.bit.model.Online_cs_Dto;


//contact-온라인 상담
@WebServlet("/home/contactOcs.bit")
public class H_online_cs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("./contact_ocs.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		Online_cs_Dao dao=new Online_cs_Dao();
		Online_cs_Dto dto=new Online_cs_Dto();
		int result=0;
		
		req.setCharacterEncoding("UTF-8"); //한글처리
		
		
		dto.setSub(req.getParameter("sub"));
		dto.setName(req.getParameter("name"));
		dto.setContent(req.getParameter("content"));
		dto.setEmail(req.getParameter("email"));
		dto.setPhone(req.getParameter("phone"));
		dto.setYn(0);
		
		
		result=dao.insertOne(dto);
		
		
		if(result==0){ //실패
			System.out.println("실패");
			resp.sendRedirect("./contact_ocs.jsp");
		}
		else{ //성공
			System.out.println("성공");
			resp.sendRedirect("../index.jsp");
		}
		
	}
}
