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
	
	public S_AttendanceDto selectOne(String emp_num){return new S_AttendanceDto();} 

}
