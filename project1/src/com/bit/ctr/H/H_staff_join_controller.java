package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp_member_Dao;
import com.bit.model.Emp_member_Dto;


@WebServlet("/home/empJoin.bit")
public class H_staff_join_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("../empjoin.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Emp_member_Dao dao = new Emp_member_Dao();
		Emp_member_Dto dto =new Emp_member_Dto();
		
		
		int result=0;
		
		req.setCharacterEncoding("UTF-8"); //한글처리
		
		dto.setDept(req.getParameter("dept"));
		dto.setId(req.getParameter("id"));
		dto.setPw(req.getParameter("pwd"));
		dto.setName(req.getParameter("name"));
		dto.setEmail(req.getParameter("email"));
		dto.setBirth(req.getParameter("birth"));
		dto.setPhone(req.getParameter("phone"));
		dto.setAddress(req.getParameter("addr"));
		
		
		result=dao.insertJoin(dto);
		
		if(result==0){ //실패
			System.out.println("실패");
			resp.sendRedirect(".");
		}
		else{ //성공
			System.out.println("성공");
			resp.sendRedirect("../index.jsp");
		}
		
		
		
		
	}
}