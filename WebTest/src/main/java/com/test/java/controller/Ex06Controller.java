package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex06Controller {
	
	@GetMapping(value = "/ex06.do")
	public String ex06() {
		
		return "ex06";
	}
	
	/*
		
		클라이언트 페이지(HTML, CSS, JavaScript 코드)
		- /java/ex06ok.do
		
		서버 페이지(자바, JSP 코드)
		- /ex06ok.do
	
	*/
	
	/*
	 * @PostMapping(value = "/ex06ok.do") public String ex06ok(HttpServletRequest
	 * req) {
	 * 
	 * // 인코딩 필터 // 1. EncodingFilter.java 생성 > 스프링 인코딩 필터 제공 // 2. web.xml > 필터 등록
	 * 
	 * // try { // req.setCharacterEncoding("UTF-8"); // } catch (Exception e) { //
	 * e.printStackTrace(); // }
	 * 
	 * String data = req.getParameter("data");
	 * 
	 * req.setAttribute("data", data);
	 * 
	 * return "ex06ok"; }
	 */
	
	/*
	 * @PostMapping(value = "/ex06ok.do") public String ex06ok(@RequestParam("data")
	 * String data, Model model) {
	 * 
	 * // 기존 방식 // - req.getParameter("key")
	 * 
	 * // 스프링 방식 // - @RequestParam("key") // - 파라미터 자동 수집 기능
	 * 
	 * model.addAttribute("data", data);
	 * 
	 * return "ex06ok"; }
	 */
	
	/*
	 * @PostMapping(value = "/ex06ok.do") public String ex06ok(String data, Model
	 * model) {
	 * 
	 * model.addAttribute("data", data);
	 * 
	 * return "ex06ok"; }
	 */
	
	/*
	 * @PostMapping(value = "/ex06ok.do") public String ex06ok(@RequestParam("data")
	 * int data, Model model) {
	 * 
	 * model.addAttribute("data", data * 2);
	 * 
	 * return "ex06ok"; }
	 */
	
	/*
	 * @PostMapping(value = "/ex06ok.do") public String ex06ok(@RequestParam(name =
	 * "data", defaultValue = "초깃값") String data, Model model) {
	 * 
	 * // - list.do // - list.do?page=1
	 * 
	 * // defaultValue // - 파라미터 null or "" > 대신할 값
	 * 
	 * model.addAttribute("data", data);
	 * 
	 * return "ex06ok"; }
	 */
	
//	@PostMapping(value = "/ex06ok.do")
//	public String ex06ok(Model model, 
//						@RequestParam("name") String name, 
//						@RequestParam("age") Integer age, 
//						@RequestParam("address") String address) {
//		
//		AddressDto dto = new AddressDto();
//		
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//		
//		SpringDao dao = new SpringDao();
//		
//		dao.add(dto);
//		
//		return "ex06ok";
//	}
	
	
//	@PostMapping(value = "/ex06ok.do")
//	public String ex06ok(Model model, AddressDto dto, @RequestParam("id") String id) {
//		
//		SpringDao dao = new SpringDao();
//		
//		dao.add(dto);
//		dap.add(id);
//		
//		return "ex06ok";
//	}

//	@PostMapping(value = "/ex06ok.do")
//	public String ex06ok(
//				//@RequestParam("cb") String[] cb
//				//String[] cb
//				//@RequestParam("cb") List<String> cb
//				//@RequestParam("cb") ArrayList<String> cb
//				//@RequestParam("cb") LinkedList<String> cb
//				//List<String> cb
//				//ArrayList<String> cb
//			) {
//	
//		//System.out.println(Arrays.toString(cb));
////		System.out.println(cb);
//	
//		return "ex06ok";
//	}

	@PostMapping(value = "/ex06ok.do")
	public String ex06ok(Model model, @ModelAttribute("data") String data) {
		
		//@ModelAttribute = @RequstParam + model.addAttribute
		
		// model.addAttribute("data", data);
		
		return "ex06ok";
	}
	
	
//	@PostMapping(value = "/ex06ok.do")
//	public String ex06ok() {
//		
//		return "ex06ok";
//	}
	
	
}
