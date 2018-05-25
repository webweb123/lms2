package com.bit.model;

import java.sql.Date;

public class Lec_create_Dto {
	private int season;
	private int emp_code;
	private int class_room;
	private String id;
	private Date sday;
	private Date eday;
	private String edu;
	private int tot;
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public int getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}
	public int getClass_room() {
		return class_room;
	}
	public void setClass_room(int class_room) {
		this.class_room = class_room;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getSday() {
		return sday;
	}
	public void setSday(Date sday) {
		this.sday = sday;
	}
	public Date getEday() {
		return eday;
	}
	public void setEday(Date eday) {
		this.eday = eday;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	
}
