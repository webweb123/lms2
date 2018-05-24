package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class S_AfterEduBbsDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<S_AfterEduBbsDto> selectAll() throws SQLException {
		String sql="SELECT * FROM lec_after";
		List<S_AfterEduBbsDto> list =new ArrayList<S_AfterEduBbsDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				S_AfterEduBbsDto dto = new S_AfterEduBbsDto();
				dto.setId(rs.getString("id"));
				dto.setSub(rs.getString("sub"));
				list.add(dto);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	public void deleteOne(String emp_num){}
	public void modiOne(String emp_num){}
	public void updateOne(String companyName) throws SQLException {
		String sql="insert into lec_after values(?,?)";
		int result=0;
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, companyName);
			result=pstmt.executeUpdate();
			if(result!=1){
				conn.rollback();
			}
			
		}catch(SQLException e){
			conn.rollback();
		}finally{
			conn.setAutoCommit(true);
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
}
