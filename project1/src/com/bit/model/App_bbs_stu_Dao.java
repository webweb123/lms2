package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class App_bbs_stu_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, String idx, String id, Date wdate,
			String name, String phone, String email, String birth,
			String address, int class_room) {
	}

	public void modiOne(int stu_code, String idx, String id, Date wdate,
			String name, String phone, String email, String birth,
			String address, int class_room) {
	}

	public App_bbs_stu_Dto selectOne(int code) {
		return new App_bbs_stu_Dto();
	}

	public List<App_bbs_stu_Dto> selectAll() {
		List<App_bbs_stu_Dto> list = null;
		return list;
	}
}
