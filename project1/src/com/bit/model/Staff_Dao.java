package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Staff_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int emp_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public void modiOne(int emp_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public Staff_Dto selectOne(int code) {
		Staff_Dto a = new Staff_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Staff_Dto();
	}

	public List<Staff_Dto> selectAll() {
		List<Staff_Dto> list = null;
		return list;
	}
}
