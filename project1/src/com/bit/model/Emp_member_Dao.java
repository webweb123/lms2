package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.util.MyOracle;

public class Emp_member_Dao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int mem_num, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public void modiOne(int mem_num, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public Emp_member_Dto selectOne(int code) {
		Emp_member_Dto a = new Emp_member_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Emp_member_Dto();
	}

	public List<Emp_member_Dto> selectAll() {
		List<Emp_member_Dto> list = null;
		return list;
	}

	public int insertJoin(Emp_member_Dto dto) {
//		String dept=dto.getDept();
		String seq="";
		int result=0;
		
		switch(dto.getDept())
		{
		case "행정": seq="a_seq.nextval"; break;
		case "강사": seq="t_seq.nextval"; break;
		case "취업": seq="j_seq.nextval"; break;
		case "영업": seq="c_seq.nextval"; break;
		}
		
		String sql="insert into emp_member values("+seq+",?,?,?,?,?,?,?)";
		
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
