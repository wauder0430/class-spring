package com.test.socket.server;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;
import com.test.socket.model.Message;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ServerEndpoint("/chatserver.do")
public class ChatServer {
	
	private static List<User> userList; // 단톡방에 있는 모든 사람들
	
	// 내부 클래스
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	class User {
		public Session session;
		public String name;
	}
	
	static {
		userList = new ArrayList<User>();
	}

	@OnOpen
	public void handleOpen(Session session) {
		System.out.println("클라이언트가 접속했습니다.");
		User user = new User(session, null);
		userList.add(user);
		
		System.out.println("userList: " + userList);
		
	}
	
	@OnMessage
	public void handleMessage(String msg, Session session) {
		System.out.println("클라이언트로부터 메시지가 도착했습니다.");
		
		//System.out.println(msg);
		
		// JSON 데이터(문자열) > 파싱 > 자바 데이터(Messege)
		Gson gson = new Gson();
		
		Message message = gson.fromJson(msg, Message.class);
		
		// System.out.println(message);
		
		if(message.getCode().equals("1")) {
			
			// 단톡방 > 새로운 유저 진입
			// 메시지 보낸 사람 == 단톡방에 막 들어온 사람
			User user = null;
			
			for(User u : userList) {
				if(u.session == session) {
					// 단톡방 사람들 중 > 메시지를 보낸 사람
					user = u;
					break;
				}
			}
			
			user.name = message.getSender();
			
			// user > session, name
			
			// 새로운 유저가 접속했습니다. > 모든 사람에게 알려주기
			
		}
		
	}
	
	@OnClose
	public void handleClose() {
		System.out.println("클라이언트가 접속을 종료했습니다.");
	}
	
	@OnError
	public void handleError(Throwable e) {
		e.printStackTrace();
	}
}
