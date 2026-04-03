package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/ex04post.do", method = RequestMethod.POST)
public class Ex04PostController {

	// 요청 메서드 > doGet() 역할
	@RequestMapping
	public String ex04post() {
		
		return "ex04post";
		
	}
	
}