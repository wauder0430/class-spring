package com.test.java.auth;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomNoOpPasswordEncoder implements PasswordEncoder{
	
	/*
	    1. 회원가입
	    	- hong, 1111 > 사용자 입력
	    	- DB 저장 > 암호화
	    	 	- "1111" > "AFFAAED123FD123" > DB 저장
	  
	 
	*/
	
	@Override
	public String encode(CharSequence rawPassword) {
		
		// 사용자가 입력한 암호 > (암호화) > 반환 
		return rawPassword.toString();
	}
	
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		return rawPassword.toString().equals(encodedPassword);
	}
}
