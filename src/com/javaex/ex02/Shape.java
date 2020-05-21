package com.javaex.ex02;

public class Shape {
	private String fillColor, lineColor;
	
	public Shape() {
		System.out.println("생성자 Triangle(0) 실행");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Triangle(2) 실행");
	}
}

