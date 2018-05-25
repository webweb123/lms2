package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Att_bbs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, Date cdate, String att) {
	}

	public void modiOne(int stu_code, Date cdate, String att) {
	}

	public Att_bbs_Dto selectOne(int code) {
		return new Att_bbs_Dto();
	}

	public List<Att_bbs_Dto> selectAll() {
		List<Att_bbs_Dto> list = null;
		return list;
	}
}
