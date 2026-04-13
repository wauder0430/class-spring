package com.test.socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChatController {

	@GetMapping(value = "/index.do")
	public String index(Model model) {

		return "index";
	}
	
	@GetMapping(value = "/chat.do")
	public String chat(Model model) {

		return "chat";
	}
	
}
