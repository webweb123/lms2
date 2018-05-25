package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Att_bbs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, Date cdate, String att) {
	}

	public void modiOne(int stu_code, Date cdate, String att) {
	}

	public Att_bbs_Dto selectOne(int code) {
		Att_bbs_Dto a = new Att_bbs_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Att_bbs_Dto();
	}

	public List<Att_bbs_Dto> selectAll() {
		List<Att_bbs_Dto> list = null;
		return list;
	}
}
