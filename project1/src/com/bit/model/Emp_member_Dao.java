package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Emp_member_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int mem_num, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public void modiOne(int mem_num, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public Emp_member_Dto selectOne(int code) {
		return new Emp_member_Dto();
	}

	public List<Emp_member_Dto> selectAll() {
		List<Emp_member_Dto> list = null;
		return list;
	}
}
