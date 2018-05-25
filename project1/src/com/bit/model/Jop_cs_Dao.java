package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Jop_cs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, int emp_code, String id, String eduCurri,
			String company, String field) {
	}

	public void modiOne(int idx, int emp_code, String id, String eduCurri,
			String company, String field) {
	}

	public Jop_cs_Dto selectOne(int code) {
		Jop_cs_Dto a = new Jop_cs_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Jop_cs_Dto();
	}

	public List<Jop_cs_Dto> selectAll() {
		List<Jop_cs_Dto> list = null;
		return list;
	}
}
