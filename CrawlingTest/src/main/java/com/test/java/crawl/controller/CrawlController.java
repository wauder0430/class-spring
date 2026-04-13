package com.test.java.crawl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.java.crawl.model.MovieDao;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CrawlController {

	@Autowired
	private MovieDao dao;
	
	@GetMapping(value = "/movie.do")
	public String movie(Model model) {

		model.addAttribute("mlist", dao.list());

		return "movie";
	}
	
}
