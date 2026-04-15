package com.test.java.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.ToString;

// 회원정보 객체
// - 기존의 User 객체 대신
@Getter
@ToString
public class CustomUser extends User {

	// 나머지 추가 정보
	private MemberDto dto;

	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public CustomUser(MemberDto dto) {

		// List<AuthDto> > (매핑) > List<SimpleGrantedAuthority>
		super(dto.getMemberid(), dto.getMemberpw(), dto.getAuthList().stream()
				.map(adto -> new SimpleGrantedAuthority(adto.getAuth())).collect(Collectors.toList()));

		this.dto = dto;
	}

}
