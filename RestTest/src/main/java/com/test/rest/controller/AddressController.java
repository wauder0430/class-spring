package com.test.rest.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.model.AddressDao;
import com.test.rest.model.AddressDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

//@Controller
//@ResponseBody

// REST API 전용 컨트롤러
@RestController
@RequiredArgsConstructor
@Api(value = "주소록 컨트롤러", description = "주소록 데이터 처리를 위한 REST Controller 입니다.")
public class AddressController {
	
	private final AddressDao dao;
	
	
	@GetMapping(value = "/m1.do")
	public @ResponseBody AddressDto m1(Model model) {

		// AddressDto > (변환) > json
		// 1. 직접 문자열(json)로 만들기 X
		// 2. JSONObject(simple-json) 비권장
		// 3. @ResponseBody(jackson-databind)
		// 		- 반환값 + @ResponseBody > 특정 메서드 적용
		//		- 클래스 + @ResponseBody > 모든 메서드 적용
		// 		- @RestController
		
		AddressDto dto = dao.m1();

		return dto;
	}
	
	// 추가하기
	// 1. http://localhost:8080/rest/address
	// 2. POST
	// 3. return int 
	@PostMapping(value = "/address")
	public int add(@RequestBody AddressDto dto) {
		
		//REST Server가 수신하는 데이터 형식
		//1. Query String > book.do?query=검색&start=10
		//2. JSON > book.do + 별도(JSON)
		
		return dao.add(dto);
	}
	
	// 목록
	// 1. http://localhost:8080/rest/address
	// 2. GET
	// 3. return List<AddressDto> > (매핑) > JSON
	@ApiOperation(value = "주소록 목록보기", notes = "주소록 목록을 반환합니다.")
	@GetMapping(value = "/address")
	public List<AddressDto> list(Model model) {

		return dao.list();
	}
	
	// 수정하기
	// 1. http://localhost:8080/rest/address/1
	// 2. PUT > 모든 컬럼 수정
	// 3. return int 
	//@RequestMapping(value = "/address/1", method = RequestMethod.PUT)
	@PutMapping(value = "/address/{seq}") // 경로 변수(Path Variable)
	public int edit(@PathVariable("seq") String seq
					, @RequestBody AddressDto dto) {
		
		dto.setSeq(seq);
		
		return dao.edit(dto);
	}
	
	// 삭제하기
	// 1. http://localhost:8080/rest/address/1
	// 2. DELETE
	// 3. return int
	@DeleteMapping(value = "/address/{seq}")
	public int del(@PathVariable("seq") String seq) {
		
		return dao.del(seq);
	}

	
	
	
}
