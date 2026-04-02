package com.test.java.di02;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		
		객체를 생성하는 순서
		
		이전 방식
		- 객체가 필요한 그 순간 의존 객체를 생성하고 사용하는 방식
		- Main 생성 > Service 생성 > Hong 생성
		
		DI 방식
		- Main 생성 > Hong 생성 > Service 생성
		
		IoC, Inversion of Controll, 제어의 역전
		- 객체 생성 순서가 거꾸로 뒤바뀐 상황
		
		- 애플리케이션 구현 > 객체 생성(+관리+소멸) 제어 흐름을 개발자가 아닌 프레임워크가 관리하기 위해서 > IoC 필수!! > DI 구현
	
		*/
		
		// Main.java
		
		// Main(사장) > Service(팀장) > Hong, Lee, Choi(팀원)
		
		System.out.println("Main 자신의 업무");
		
		Hong hong = new Hong();
		Lee lee = new Lee();
		
		Service service = new Service(lee); // 의존 주입(DI)
		service.doSomething();
		
		System.out.println("Main 자신의 업무");
		
	}
	
}
