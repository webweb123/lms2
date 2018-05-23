package com.bit.model.normal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class AfterEduBbsDao {//lec_after
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<AfterEduBbsDto> selectAll() throws SQLException {
		String sql="SELECT * FROM lec_after";
		List<AfterEduBbsDto> list =new ArrayList<AfterEduBbsDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				AfterEduBbsDto dto = new AfterEduBbsDto();
				dto.setId(rs.getString("id"));
				dto.setContent(rs.getString("content"));
				dto.setHit(rs.getInt("hit"));
				dto.setIdx(rs.getInt("idx"));
				dto.setSub(rs.getString("sub"));
				dto.setWdate(rs.getDate("wdate"));
				list.add(dto);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	
	public AfterEduBbsDto selectOne(int idx) throws SQLException{
		String sql="select * from emp where idx=?";
		AfterEduBbsDto bean = new AfterEduBbsDto();
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
