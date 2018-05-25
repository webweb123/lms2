package com.bit.model;

import java.sql.Date;

public class App_bbs_stu_Dto {
	private int stu_code;
	private String idx;
	private String id;
	private Date wdate;
	private String name;
	private String phone;
	private String email;
	private String birth;
	private String address;
	private int class_room;
	public int getStu_code() {
		return stu_code;
	}
	public void setStu_code(int stu_code) {
		this.stu_code = stu_code;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getClass_room() {
		return class_room;
	}
	public void setClass_room(int class_room) {
		this.class_room = class_room;
	}
	
	
}
