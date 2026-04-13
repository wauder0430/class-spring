<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
</head>
<body>
	<!-- index.jsp -->
    
    <h1>WebSocket <small>chat</small></h1>
    
    <div>
        <div class="group">
            <label>대화명</label>
            <input type="text" name="name" id="name" class="short" required value="강아지">
        </div>
    </div>
    <hr>
    <div>
        <button type="button" class="in">들어가기</button>
    </div>
	
	<script src="https://code.jquery.com/jquery-4.0.0.js"></script>
    <script src="https://code.jquery.com/ui/1.14.2/jquery-ui.js"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
		$('.in').click(() => {
			
			let name = $('#name').val().trim();
			
			const child = window.open('/socket/chat.do', 'chat', 'width=406, height=518');
			
			$('#name').prop('readOnly', true);
			$('.in').prop('disabled', true);
			
			// 대화창 > 초기작업
			//setTimeout(() => {
    		//	child.connect(name);
			//}, 1000);
		    
			// onload 이벤트 > 
			child.addEventListener('load', () => {
			    
				child.connect(name);
				
			});
			
		});
	</script>
</body>
</html>