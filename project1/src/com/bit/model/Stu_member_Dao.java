package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Stu_member_Dao {
	
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	
	public void deleteOne(int code) {
	}

	public void updateOne(int stu_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public void modiOne(int stu_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public Stu_member_Dto selectOne(int code) {
		Stu_member_Dto a = new Stu_member_Dto();
		
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return new Stu_member_Dto();
	
	}

	public List<Stu_member_Dto> selectAll() {
		List<Stu_member_Dto> list = null;
		return list;
	}

	public int insertJoin(Stu_member_Dto dto) {
		
		String sql="INSERT INTO STU_MEMBER VALUES(STU_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
		int result=0;
		
		
		try {
			
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getBirth());
			pstmt.setString(7, dto.getAddress());
			
			result=pstmt.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
}
