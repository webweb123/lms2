package com.bit.model.normal;

import java.sql.Date;

public class JobInformBbsDto {//취업정보게시판
	private int idx;//번호
	private String company;//업체명
	private String local;//지역
	private int people;//모집인원
	private String status;//고용형태
	private Date wDay;//작성일자
	private Date eDay;//마감일자
	private String right;//응시자격
	private String email;//이메일
	private String content;//내용
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getwDay() {
		return wDay;
	}
	public void setwDay(Date wDay) {
		this.wDay = wDay;
	}
	public Date geteDay() {
		return eDay;
	}
	public void seteDay(Date eDay) {
		this.eDay = eDay;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
