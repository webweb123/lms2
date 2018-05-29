package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Lec_create_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne( int emp_code, int class_room, String id,
			Date sday,String edu,int tot) {
		String sql ="insert into lec_create values(lec_create_sequ.nextval,?,?,?,?,?,?,0)";
		Lec_create_Dto a = new Lec_create_Dto();
		try {
			conn=MyOracle.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp_code);
			pstmt.setInt(2, class_room);
			pstmt.setString(3, id);
			pstmt.setDate(4, sday);
			pstmt.setDate(5, sday);
			pstmt.setString(6, edu);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modiOne(int season, int emp_code, int class_room, String id,
			Date sday, Date eday, String edu, int tot) {
	}

	public Lec_create_Dto selectOne(int code) {
		Lec_create_Dto a = new Lec_create_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Lec_create_Dto();
	}

	public List<Lec_create_Dto> selectAll() {
		List<Lec_create_Dto> list = null;
		return list;
	}
}
