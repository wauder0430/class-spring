package com.test.java.model;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//스프링빈
//@Component
@Repository
public class SpringDao {

	public int count() {
		
		// select count(*) from tblBoard
		return 300;
		
	}

	public void add(AddressDto dto) {
		
		System.out.println("확인 > " + dto.toString());
		
	}
	
	// ex08
	public String work() {
		
		// select 한 값...
		
		return "스프링 확인용";
	}
	
}
