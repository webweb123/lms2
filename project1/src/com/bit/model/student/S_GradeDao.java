package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class S_GradeDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public void updateOne(int emp_num){}
	public void deleteOne(int emp_num){}
	public void modiOne(int emp_num){}
	public S_GradeDto selectOne(int emp_num){return new S_GradeDto();}
	public List<S_GradeDto> selectAll() throws SQLException {
		String sql="SELECT * FROM AfterClassBbs";
		List<S_GradeDto> list =new ArrayList<S_GradeDto>();
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				S_GradeDto dto = new S_GradeDto();
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
