package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class Lec_after_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, String id, String sub, String content,
			int hit, Date wdate) {
	}

	public void modiOne(int stu_code, String id, String sub, String content,
			int hit, Date wdate) {
	}

	public Lec_after_Dto selectOne(int code) {
		Lec_after_Dto a = new Lec_after_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Lec_after_Dto();
	}

	public List<Lec_after_Dto> selectAll() {
		List<Lec_after_Dto> list = new ArrayList<Lec_after_Dto>();
		String sql="SELECT * FROM LEC_AFTER";
		
		try {
			
			
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				
				Lec_after_Dto dto=new Lec_after_Dto();
				dto.setStu_code(rs.getInt(1));
				dto.setId(rs.getString(2));
				dto.setSub(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setHit(rs.getInt(5));
				dto.setWdate(rs.getDate(6));
				
				list.add(dto);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
}
