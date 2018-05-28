package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Job_ad_Dao {
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

	public Job_ad_Dto selectOne(int code) {
		Job_ad_Dto a = new Job_ad_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Job_ad_Dto();
	}

	public List<Job_ad_Dto> selectAll() {
		List<Job_ad_Dto> list = null;
		return list;
	}

}
