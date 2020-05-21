package com.javaex.ex04;

public class Employee extends User {
	private int salary;

	// 생성자
	public Employee() {}
	public Employee(String id, String pw, String name, int salary) {
		super(id, pw, name);
		this.salary = salary;
	}
	
	// getter/setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// showInfo
		public void showInfo() {
			System.out.println("#아이디 : " + super.getId() + " / #패스워드 : " + super.getPw()
								+ " / #이름 : " + super.getName() + " / #월급: " + salary);
			
			System.out.println(super.getName() + "의 월급은 " + salary);
		}
}
