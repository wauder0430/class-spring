package com.test.mybatis.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InsaDto {
	
	private String num;
	private String name;
	private String buseo;
	private String jikwi;
	private Integer salary;	// basicpay
	
	// 1:N
	private List<ProjectDto> project; 
	
}
