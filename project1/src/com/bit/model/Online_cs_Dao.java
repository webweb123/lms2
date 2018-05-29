package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

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
		Online_cs_Dto a = new Online_cs_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Online_cs_Dto();
	}

	public List<Online_cs_Dto> selectAll() {
		List<Online_cs_Dto> list = null;
		return list;
	}

	public int insertOne(Online_cs_Dto dto) {
		int result=0;
		String sql="insert into online_cs values(ocs_seq.nextval,?,?,?,?,?,sysdate,?)";
		
		try {
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSub());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getPhone());
			pstmt.setInt(6, dto.getYn());
			
			result=pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
