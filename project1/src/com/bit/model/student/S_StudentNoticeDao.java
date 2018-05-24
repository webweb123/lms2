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
	public List<S_StudentNoticeDto> selectAll() throws SQLException {
		String sql="SELECT * FROM notice_bbs";
		List<S_StudentNoticeDto> list =new ArrayList<S_StudentNoticeDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				S_StudentNoticeDto dto = new S_StudentNoticeDto();
				dto.setIdx(rs.getInt("idx"));
				dto.setSub(rs.getString("sub"));
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
}
