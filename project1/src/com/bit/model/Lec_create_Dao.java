package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Lec_create_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int season, int emp_code, int class_room, String id,
			Date sday, Date eday, String edu, int tot) {
	}

	public void modiOne(int season, int emp_code, int class_room, String id,
			Date sday, Date eday, String edu, int tot) {
	}

	public Lec_create_Dto selectOne(int code) {
		return new Lec_create_Dto();
	}

	public List<Lec_create_Dto> selectAll() {
		List<Lec_create_Dto> list = null;
		return list;
	}
}
