package com.bit.ctr.H;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp_member_Dao;
import com.bit.model.Staff_Dao;
import com.bit.model.Stu_member_Dao;
import com.bit.model.Student_Dao;

public class H_login_af_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Staff_Dao dao = new Staff_Dao();
		Stu_member_Dao dao2 = new Stu_member_Dao();
		Student_Dao dao3 = new Student_Dao();
		Emp_member_Dao dao4 = new Emp_member_Dao();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}