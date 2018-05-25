package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Jop_cs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, int emp_code, String id, String eduCurri,
			String company, String field) {
	}

	public void modiOne(int idx, int emp_code, String id, String eduCurri,
			String company, String field) {
	}

	public Jop_af_Dto selectOne(int code) {
		return new Jop_af_Dto();
	}

	public List<Jop_af_Dto> selectAll() {
		List<Jop_af_Dto> list = null;
		return list;
	}
}
