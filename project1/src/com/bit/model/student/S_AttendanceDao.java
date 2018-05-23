package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class S_AttendanceDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<S_AfterSucStuBbsDto> selectAll() throws SQLException {
		String sql="SELECT * FROM free_bbs";
		List<S_AfterSucStuBbsDto> list =new ArrayList<S_AfterSucStuBbsDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				S_AfterSucStuBbsDto dto = new S_AfterSucStuBbsDto();
				//dto.setId(rs.getString("id"));
				list.add(dto);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
}
