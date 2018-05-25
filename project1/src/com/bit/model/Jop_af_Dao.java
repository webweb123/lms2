package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Jop_af_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, int season, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public void modiOne(int stu_code, int season, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public Jop_af_Dto selectOne(int code) {
		Jop_af_Dto a = new Jop_af_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Jop_af_Dto();
	}

	public List<Jop_af_Dto> selectAll() {
		List<Jop_af_Dto> list = null;
		return list;
	}
}
