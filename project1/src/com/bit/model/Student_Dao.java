package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Student_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne( int stu_code
	, int season
	, String id
	, String pw
	, String name
	, String phone
	, String email
	, String birth
	, String address
	, int class_room) {
	}

	public void modiOne(int stu_code
			, int season
			, String id
			, String pw
			, String name
			, String phone
			, String email
			, String birth
			, String address
			, int class_room) {
	}

	public Student_Dto selectOne(int code) {
		return new Student_Dto();
	}

	public List<Student_Dto> selectAll() {
		List<Student_Dto> list = null;
		return list;
	}
}
