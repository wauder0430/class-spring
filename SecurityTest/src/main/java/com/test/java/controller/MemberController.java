package com.test.java.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.java.model.AuthDto;
import com.test.java.model.MemberDao;
import com.test.java.model.MemberDto;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberDao dao;
	private final BCryptPasswordEncoder encoder;
	
	@GetMapping(value = "/register.do")
	public String register(Model model) {

		return "register";
	}
	
	@PostMapping(value = "/registerok.do")
	public String registerok(Model model, MemberDto dto, String auth) {

		// 회원 가입 > DTO + 암호화 > insert
		dto.setMemberpw(encoder.encode(dto.getMemberpw()));
		dao.add(dto);
		
		// 권한 추가
		// 1. 일반회원 > ROLE_MEMBER
		// 2. 관리자   > ROLE_MEMBER, ROLE_ADMIN
		if(auth.equals("1") || auth.equals("2")) {
			AuthDto adto = new AuthDto();
			adto.setMemberid(dto.getMemberid());
			adto.setAuth("ROLE_MEMBER");
			dao.addAuth(adto);
		}
		
		if(auth.equals("2")) {
			AuthDto adto = new AuthDto();
			adto.setMemberid(dto.getMemberid());
			adto.setAuth("ROLE_ADMIN");
			dao.addAuth(adto);
		} 
		
		return "redirect:/index.do";
	}
	
}
