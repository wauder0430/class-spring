package com.test.java.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.java.model.CustomUser;
import com.test.java.model.MemberDao;
import com.test.java.model.MemberDto;

public class CustomUserDetailsService implements UserDetailsService{

	// 1. /customlogin.do > 아이디(hong), 암호(1111) 입력
	// 2. POST + "/login" > 요청
	// 3. 인증 처리
	// 		- loadUserByUsername() 호출
	
	@Autowired
	private MemberDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberDto dto = dao.get(username);
		
		return dto != null ? new CustomUser(dto) : null;
	}

}
