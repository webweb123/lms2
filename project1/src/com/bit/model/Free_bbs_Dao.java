package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class Free_bbs_Dao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void deleteOne(int code) {
	}

	public void updateOne(int idx, int stu_code, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public void modiOne(int idx, int stu_code, String id, String sub,
			String content, int hit, Date wdate) {
	}

	public Free_bbs_Dto selectOne(int code) {
		
		
		return new Free_bbs_Dto();
	}

	public List<Free_bbs_Dto> selectAll() throws ClassNotFoundException, SQLException {
		List<Free_bbs_Dto> list = new ArrayList<Free_bbs_Dto>();
		String sql = "select * from free_bbs";
		try{
			conn=MyOracle.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Free_bbs_Dto bean = new Free_bbs_Dto();
				bean.setContent(rs.getString("content"));
				bean.setHit(rs.getInt("hit"));
				bean.setId(rs.getString("id"));
				bean.setStu_code(rs.getInt("stu_code"));
				bean.setIdx(rs.getInt("idx"));
				bean.setSub(rs.getString("sub"));
				bean.setWdate(rs.getDate("wdate"));
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
