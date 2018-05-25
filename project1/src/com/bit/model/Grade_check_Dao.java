package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Grade_check_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, String id, String java, String web,
			String db) {
	}

	public void modiOne(int stu_code, String id, String java, String web,
			String db) {
	}

	public Grade_check_Dto selectOne(int code) {
		Grade_check_Dto a = new Grade_check_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Grade_check_Dto();
	}

	public List<Grade_check_Dto> selectAll() {
		List<Grade_check_Dto> list = null;
		return list;
	}
}
