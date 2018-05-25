package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Online_cs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, String name, String sub, String content,
			String email, String phone, Date wdate, int yn) {
	}

	public void modiOne(int idx, String name, String sub, String content,
			String email, String phone, Date wdate, int yn) {
	}

	public Online_cs_Dto selectOne(int code) {
		Online_cs_Dto a = new Online_cs_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Online_cs_Dto();
	}

	public List<Online_cs_Dto> selectAll() {
		List<Online_cs_Dto> list = null;
		return list;
	}
}
