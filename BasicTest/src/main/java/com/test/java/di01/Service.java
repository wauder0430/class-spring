package com.test.java.di01;

public class Service {
	
	// 1. DI 패턴 구현 > 의존 객체를 담을 멤버 변수를 선언한다.
	private Hong hong;
	private Lee lee;
	
	// 2. DI 패턴 구현 	> 의존 객체를 주입받는다.
	// 	 			   	> 의존 주입 도구를 만든다. (생성자 or Setter)
	public Service(Hong hong) {
		this.hong = hong;
	}
	
	public Service(Lee lee) {
		this.lee = lee;
	}
	
	/*
	 * public void setHong(Hong hong) { this.hong = hong; }
	 */
	
	public void doSomething() {
		
		// Service 자신의 업무
		System.out.println("Service 자신의 업무");
		
		// DI, Dependency Injection
		// - 의존(성) 주입
		// - 디자인 패턴
		// - 객체가 필요로 하는 의존성(객체)를 외부에서 주입해 주는 패턴

		// 기존 방식
		// - 의존 객체를 자신이 직접 생성해서 + 사용한다.
		
		// 일부 업무 > Hong 호출
		// Hong hong = new Hong();
		
		//hong.work();
		
		lee.work();
		
		System.out.println("Service 자신의 업무");
		
	}
	
}
