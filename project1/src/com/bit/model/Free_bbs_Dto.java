package com.bit.model;

import java.sql.Date;

public class Free_bbs_Dto {
	private int idx;
	private int stu_code;
	private String id;
	private String sub;
	private String content;
	private int hit;
	private Date wdate;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getStu_code() {
		return stu_code;
	}
	public void setStu_code(int stu_code) {
		this.stu_code = stu_code;
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
