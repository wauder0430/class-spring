package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.java.model.AddressDto;

@Controller
public class Ex07Controller {
	
	// 요청 메서드의 반환값 종류

	// 1. String
	// - JSP 파일명
	// - ViewResolver
//	@GetMapping(value = "/ex07.do")
//	public String ex07(Model model) {
//
//		return "ex07";
//	}
	
	//2. void
	// - Spring 4.3 이후 지원
	// - 요청 주소의 이름과 동일한 JSP를 호출한다.
//	@GetMapping(value = "/ex07.do")
//	public void ex07(Model model) {
//		// ex07.jsp를 자동으로 호출한다.
//	}
	
	// 3. String > 키워드
	// - redirect: > resp.sendRedirect() 역할
	// - forward: > pageContext.forward() 역할
//	@GetMapping(value = "/ex07.do")
//	public String ex07(Model model) {
//
//		//return "redirect:ex06.do";
//		return "forward:ex06.do";
//	}

	// 4. 쿼리스트링
//	@GetMapping(value = "/ex07.do")
//	public String ex07(Model model, RedirectAttributes rttr) {
//
//		// 업무 처리 > 다른 페이지로 이동
//		// - list.do?page=10&search=y
//		
//		String page = "10";
//		String search = "y";
//		
//		rttr.addAttribute("page", page);
//		rttr.addAttribute("search", search);
//
//		//return "redirect:/list.do?page=" + page + "&search=" + search;
//		return "redirect:/list.do";
//	}
	
	
	// 5. JSON 반환
	// - 의존성 추가
	// - @ResponseBody
	@GetMapping(value = "/ex07.do")
	public @ResponseBody AddressDto ex07(Model model) {

		AddressDto dto = new AddressDto();

		dto.setName("강아지");
		dto.setAge(3);
		dto.setAddress("서울시 강남구 대치동");
		
		/*
			
			JSON, JavaScript Object Notation
		 	- 자바스크립트 객체 표현법
		 	
		 	{
		 		"name": "강아지",
		 		"age": 3,
		 		"address": "서울시"
		 	}
		 
		*/
		
		return dto;
	}
	
	
}
