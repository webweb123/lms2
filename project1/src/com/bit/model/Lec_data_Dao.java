package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Lec_data_Dao {
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

	public Lec_data_Dto selectOne(int code) {
		return new Lec_data_Dto();
	}

	public List<Lec_data_Dto> selectAll() {
		List<Lec_data_Dto> list = null;
		return list;
	}
}
