package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.teather.T_AttendanceDto;
import com.bit.util.MyOracle;

public class S_StudentNoticeDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public List<T_AttendanceDto> selectAll() throws SQLException {
		String sql="SELECT * FROM AfterClassBbs";
		List<T_AttendanceDto> list =new ArrayList<T_AttendanceDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				T_AttendanceDto dto = new T_AttendanceDto();
				//dto.set(rs.getInt("id"));
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
