package com.bit.model.normal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.person.StudentDto;
import com.bit.util.MyOracle;

public class AfterSucStuBbsDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<AfterSucStuBbsDto> selectAll() throws SQLException {
		String sql="SELECT * FROM AfterClassBbs";
		List<AfterSucStuBbsDto> list =new ArrayList<AfterSucStuBbsDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				AfterSucStuBbsDto dto = new AfterSucStuBbsDto();
				dto.setId(rs.getString("id"));
				list.add(dto);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	
	public AfterSucStuBbsDto selectOne(int idx) throws SQLException{
		String sql="select * from emp where idx=?";
		AfterSucStuBbsDto bean = new AfterSucStuBbsDto();
		try{
			try {
				conn=MyOracle.getConnection();
				conn.setAutoCommit(false);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setId(rs.getString("idx"));

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
