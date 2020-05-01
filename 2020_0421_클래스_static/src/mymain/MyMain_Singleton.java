//사용자 (내가 알고싶은거)

//Singleton

package mymain;

import java.util.Calendar;

import java.util.Date;

import myutil.My_Singleton;

public class MyMain_Singleton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. sayHello 가 뭔지 알고싶다
		// instance method 이기 때문에 객체가 생성이 되어야함 new 사용
		//100명이 쓰려면 객체 new 100개 만들어야함 
		
		
		//2. for를 통해 100명이쓰는거 확인
		
		for(int i=0; i<10; i++){
			
		//My_Singleton ms = new My_Singleton();
			
		// My_Singleton 한테 getinstance 줘라	20라인이랑 차이점 확인 
		// 오른쪽 13line ~ 19line 참고
			
			
	   //util 28line public을 private 으로 줘도 사용가능 조작방지 숨기기
		// 그러나 23line 은 다른 파일에있기때문에 오류뜸
		My_Singleton ms = My_Singleton.getinstance();
		ms.sayHello();
		}
		
		System.out.println();
		
		// 반복시키기
		// 시계 만들기 Calendar
		while (true) {
		Calendar c = Calendar.getInstance();
		
		int hour = c.get(Calendar. HOUR);
		int minute = c.get(Calendar. MINUTE);
		int second = c.get(Calendar. SECOND);
		
			
		//java.util Date 날짜 구하기 옛날방식 jdk 5.0 이전
//////// new 객체를 계속 생성함 위 44 LINE Calendar 의 최신 방식과 차이
		
		//Date today = new Date();	
		//int hour = today.getHours();
		//int minute = today.getMinutes();
		//int second = today.getSeconds();
		
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
		
		Thread.sleep(1000);
		
			}
		}
	}
