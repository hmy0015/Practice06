package com.javaex.ex04;

public class User {
	private String id, pw, name;

	// 생성자
	public User() {};
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	// getter/setter
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// showInfo
	public void showInfo() {
		System.out.println("#아이디 : " + id + " / #패스워드 : " + pw + " / #이름 : " + name);
	}
}
