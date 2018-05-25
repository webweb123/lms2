package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Online_cs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, String name, String sub, String content,
			String email, String phone, Date wdate, int yn) {
	}

	public void modiOne(int idx, String name, String sub, String content,
			String email, String phone, Date wdate, int yn) {
	}

	public Online_cs_Dto selectOne(int code) {
		return new Online_cs_Dto();
	}

	public List<Online_cs_Dto> selectAll() {
		List<Online_cs_Dto> list = null;
		return list;
	}
}
