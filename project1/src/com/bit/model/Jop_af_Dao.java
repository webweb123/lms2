package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Jop_af_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, int season, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public void modiOne(int stu_code, int season, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public Jop_af_Dto selectOne(int code) {
		return new Jop_af_Dto();
	}

	public List<Jop_af_Dto> selectAll() {
		List<Jop_af_Dto> list = null;
		return list;
	}
}
