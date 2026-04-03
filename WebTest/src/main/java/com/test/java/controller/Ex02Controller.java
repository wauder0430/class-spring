package com.test.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.java.model.SpringDao;

public class Ex02Controller implements Controller{
	
	// 의존 도구 구현(생성자 or Setter)
	private SpringDao dao;
	
	public Ex02Controller(SpringDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// DB 작업 > 위임
		// - Ex02Controller는 SpringDao를 의존한다.
		
		// 의존 객체 > 의존 주입으로 변경
		// SpringDao dao = new SpringDao();
		
		int count = dao.count();
		
		ModelAndView mv = new ModelAndView("ex02");
		mv.addObject("count", count);
		
		return mv;
	}
}
