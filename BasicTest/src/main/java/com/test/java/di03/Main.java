package com.test.java.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// 객체 생성 + 관리 + 소멸 > 스프링 역할 > 스프링 컨테이너
		
		// 직접 생성
		Hong o1 = new Hong();
		o1.work();
		
		// 스프링을 통해서 생성
		

		// 2. 스프링 컨테이너 생성
		// 스프링 컨테이너 생성(== OO 컨텍스트)
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/di03/di03.xml");
		
		// 3. 빈 생성 > 빈(오브젝트) 반환
		// - o2 == 스프링 빈
		Hong o2 = (Hong)context.getBean("hong"); // new Hong()
		o2.work();
		
		Lee o3 = (Lee)context.getBean("lee"); // new Lee()
		o3.work();
		
	}
	
}
