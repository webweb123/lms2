package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class App_bbs_emp_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void deleteOne(int code){}
	public void updateOne( int emp_num, int idx, String id, 
			Date wdate, String name, String phone, String email,
			String birth, String address){}
	public void modiOne(int emp_num, int idx, String id, 
			Date wdate, String name, String phone, String email,
			String birth, String address){}
	public App_bbs_emp_Dto selectOne(int code){return new App_bbs_emp_Dto();}
	public List<App_bbs_emp_Dto> selectAll() {
		List<App_bbs_emp_Dto> list = null;
		return list;
	}
}
