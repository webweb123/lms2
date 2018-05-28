package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp_member_Dao;
import com.bit.model.Emp_member_Dto;
import com.bit.model.Staff_Dao;
import com.bit.model.Staff_Dto;
import com.bit.model.Stu_member_Dao;
import com.bit.model.Stu_member_Dto;
import com.bit.model.Student_Dao;
import com.bit.model.Student_Dto;

public class H_login_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		Stu_member_Dto a = new Stu_member_Dto();
		Stu_member_Dao b = new Stu_member_Dao();
		Staff_Dao c = new Staff_Dao();
		Staff_Dto f = new Staff_Dto();
		Emp_member_Dao d = new Emp_member_Dao();
		Emp_member_Dto g = new Emp_member_Dto();
		Student_Dao e = new Student_Dao();
		Student_Dto h = new Student_Dto();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}