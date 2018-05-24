package com.bit.model.student;

import java.sql.Date;

public class S_LessonReferenceRoomDto {
	private int emp_num;
	private String id;
	private String sub;
	private String content;
	private int hit;
	private Date wdate;
	public int getEmp_num() {
		return emp_num;
	}
	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
	
}
