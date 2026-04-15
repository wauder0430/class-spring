package com.test.java.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberDao {

	private final SqlSessionTemplate template;

	public void add(MemberDto dto) {
		
		template.insert("member.add", dto);
	}

	public void addAuth(AuthDto adto) {
		
		template.insert("member.addAuth", adto);
	}

	public MemberDto get(String username) {

		return template.selectOne("member.get", username);
	}
	
}
