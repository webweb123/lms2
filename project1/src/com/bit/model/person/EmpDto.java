package com.bit.model.person;

public class EmpDto {
	private String id;
	private String pw;
	private String email;
	private String name;
	private int phone;
	private int both;
	private int addr;
	private String dep;//부서명
	private int empNum;//GuestDto 에서 추가된 속성( 첫 숫자로 부서를 구분 )
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getBoth() {
		return both;
	}
	public void setBoth(int both) {
		this.both = both;
	}
	public int getAddr() {
		return addr;
	}
	public void setAddr(int addr) {
		this.addr = addr;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	
	
	
}
