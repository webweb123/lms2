package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Lec_after_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, String id, String sub, String content,
			int hit, Date wdate) {
	}

	public void modiOne(int stu_code, String id, String sub, String content,
			int hit, Date wdate) {
	}

	public Lec_after_Dto selectOne(int code) {
		Lec_after_Dto a = new Lec_after_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Lec_after_Dto();
	}

	public List<Lec_after_Dto> selectAll() {
		List<Lec_after_Dto> list = null;
		return list;
	}
}
