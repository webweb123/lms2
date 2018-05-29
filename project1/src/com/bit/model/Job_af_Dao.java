package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class Job_af_Dao {
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

	public Job_af_Dto selectOne(int code) {
		Job_af_Dto a = new Job_af_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Job_af_Dto();
	}

	public List<Job_af_Dto> selectAll() {
		
		
		
		List<Job_af_Dto> list = new ArrayList<Job_af_Dto>();
		
		String sql="SELECT * FROM JOP_AF";
		
		try {
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
			
				Job_af_Dto dto=new Job_af_Dto();
				dto.setStu_code(rs.getInt(1));
				dto.setSeason(rs.getInt(2));
				dto.setId(rs.getString(3));
				dto.setSub(rs.getString(4));
				dto.setContent(rs.getString(5));
				dto.setHit(rs.getInt(6));
				dto.setWdate(rs.getDate(7));
				
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
