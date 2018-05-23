package com.bit.model.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.util.MyOracle;

public class EmpDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmpDto selectOne(int empNum) throws SQLException{
		String sql="select * from emp where empNum=?";
		EmpDto bean = new EmpDto();
		try{
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empNum);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setId(rs.getString("id"));

			}
			conn.commit();
		}catch(SQLException e){
			conn.rollback();
		}finally{
			conn.setAutoCommit(true);
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
		return bean;
	}
	
}
