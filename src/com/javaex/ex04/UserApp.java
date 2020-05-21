package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		User u03 = new Employee("master", "m7788", "운영자", 5000000);
		
		User info[] = new User[3];
		info[0] = u01;
		info[1] = u02;
		info[2] = u03;
		
		for(int i = 0; i < info.length; i++) {
			info[i].showInfo();
		}
	}
}
