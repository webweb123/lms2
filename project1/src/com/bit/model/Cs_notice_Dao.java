package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Cs_notice_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, int emp_code, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public void modiOne(int idx, int emp_code, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public Cs_notice_Dto selectOne(int code) {
		Cs_notice_Dto a = new Cs_notice_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Cs_notice_Dto();
	}

	public List<Cs_notice_Dto> selectAll() {
		List<Cs_notice_Dto> list = null;
		return list;
	}
}
