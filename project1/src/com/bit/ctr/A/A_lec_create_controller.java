package com.bit.ctr.A;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Free_bbs_Dao;
import com.bit.model.Free_bbs_Dto;
import com.bit.model.Lec_create_Dao;
import com.bit.model.Lec_create_Dto;
import com.bit.model.Staff_Dao;
import com.bit.model.Staff_Dto;
@WebServlet("/guest/free_create.bit")
public class A_lec_create_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Staff_Dao dao = new Staff_Dao();
		List<Staff_Dto> list = null;

		try {
			list = dao.selectAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("alist", list);
		RequestDispatcher rd = req.getRequestDispatcher("../A_lec_create.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
