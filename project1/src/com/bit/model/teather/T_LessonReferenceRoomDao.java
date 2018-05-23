package com.bit.model.teather;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class T_LessonReferenceRoomDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public List<T_LessonReferenceRoomDto> selectAll() throws SQLException {
		String sql="SELECT * FROM AfterClassBbs";
		List<T_LessonReferenceRoomDto> list =new ArrayList<T_LessonReferenceRoomDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				T_LessonReferenceRoomDto dto = new T_LessonReferenceRoomDto();
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
