package com.rt;

public class EmpRecordEntity {
	private int id;
	private String fname;
	private String lname;
	private String number ;
	private String userName;
	private String password;
	public EmpRecordEntity(int id, String fname, String lname, String number, String userName, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.number = number;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	



}
