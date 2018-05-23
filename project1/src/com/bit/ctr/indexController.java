package com.bit.ctr;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.student.S_FreeBbsDao;
import com.bit.model.student.S_FreeBbsDto;

@WebServlet("/index.bit")
public class indexController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		S_FreeBbsDao dao = new S_FreeBbsDao();
		List<S_FreeBbsDto> list=null;
		try {
			list = dao.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		req.setAttribute("alist", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("./index.jsp");
		rd.forward(req, resp);
	}
}
