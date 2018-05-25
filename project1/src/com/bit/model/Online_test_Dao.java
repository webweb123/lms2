package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Online_test_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne( int qnum
	, String question
	, String example
	, int answer
	, int class_room) {
	}

	public void modiOne(int qnum
			, String question
			, String example
			, int answer
			, int class_room) {
	}

	public Online_cs_Dto selectOne(int code) {
		return new Online_cs_Dto();
	}

	public List<Online_cs_Dto> selectAll() {
		List<Online_cs_Dto> list = null;
		return list;
	}
}
