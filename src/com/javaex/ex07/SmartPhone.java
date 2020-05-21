package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if(str.equals("앱")) {
        	app();
        }
        else if(str.equals("음악")) {
        	music();
        }
        else if(str.equals("통화")) {
        	call();
        }
    }
    
    public void app() {
    	System.out.println("앱 실행");
    }
    public void music() {
    	System.out.println("다운로드에서 음악재생");
    }
    public void call() {
    	System.out.println("통화기능 시작");
    }
}
