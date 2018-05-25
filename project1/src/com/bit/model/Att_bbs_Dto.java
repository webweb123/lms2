package com.bit.model;

import java.sql.Date;

public class Att_bbs_Dto {
	private int stu_code;
	private Date cdate;
	private String att;
	public int getStu_code() {
		return stu_code;
	}
	public void setStu_code(int stu_code) {
		this.stu_code = stu_code;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getAtt() {
		return att;
	}
	public void setAtt(String att) {
		this.att = att;
	}
	
	
}
