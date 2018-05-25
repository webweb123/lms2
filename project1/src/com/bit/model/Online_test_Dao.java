package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Online_test_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int qnum, String question, String example,
			int answer, int class_room) {
	}

	public void modiOne(int qnum, String question, String example, int answer,
			int class_room) {
	}

	public Online_test_Dto selectOne(int code) {
		Online_test_Dto a = new Online_test_Dto();
		try {
			conn = MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Online_test_Dto();
	}

	public List<Online_test_Dto> selectAll() {
		List<Online_test_Dto> list = null;
		return list;
	}
}
