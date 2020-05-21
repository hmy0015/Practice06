package com.javaex.ex05;

public class Depart extends Employee {
	private String information;

	public Depart() {}
	public Depart(String name, int salary, String information) {
		super(name, salary);
		this.information = information;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	public void showInformation() {
        System.out.println("이름 : " + super.getName() + "  연봉 : " + super.getSalary() + "  부서 : " + information);
	}
}
