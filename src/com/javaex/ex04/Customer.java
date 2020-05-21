package com.javaex.ex04;

public class Customer extends User {
	private int point;

	// 생성자
	public Customer() {}
	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;
	}
	
	// getter/setter
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	// showInfo
	public void showInfo() {
		System.out.println("#아이디 : " + super.getId() + " / #패스워드 : " + super.getPw()
							+ " / #이름 : " + super.getName() + " / #포인트: " + point);
	}
}
