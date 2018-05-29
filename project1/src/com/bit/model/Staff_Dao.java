package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class Staff_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int emp_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public void modiOne(int emp_code, String id, String pw, String name,
			String phone, String email, String birth, String address) {
	}

	public Staff_Dto selectOne(int code) {
		Staff_Dto a = new Staff_Dto();
		try {
			conn=MyOracle.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Staff_Dto();
	}

	public List<Staff_Dto> selectAll() throws SQLException, ClassNotFoundException {
		List<Staff_Dto> list = new ArrayList<Staff_Dto>();
		String sql = "select * from staff where emp_code>2000 and emp_code<3000";
		try{
			conn=MyOracle.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Staff_Dto bean = new Staff_Dto();
				bean.setName(rs.getString("name"));
				list.add(bean);
			}
			
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
		
		
		return list;
	}
}
