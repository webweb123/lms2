package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class S_AfterSucStuBbsDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void selectOne(String emp_num){}
	public void deleteOne(String emp_num){}
	public void modiOne(String emp_num){}
	public List<S_AttendanceDto> selectAll() throws SQLException {
		String sql="SELECT * FROM free_bbs";
		List<S_AttendanceDto> list =new ArrayList<S_AttendanceDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				S_AttendanceDto dto = new S_AttendanceDto();
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
