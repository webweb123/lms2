package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

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
		return new Lec_after_Dto();
	}

	public List<Lec_after_Dto> selectAll() {
		List<Lec_after_Dto> list = null;
		return list;
	}
}
