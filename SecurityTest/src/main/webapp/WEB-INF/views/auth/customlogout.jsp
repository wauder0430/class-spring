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
    <!-- customlogout.jsp -->
    <%@include file="/WEB-INF/views/inc/header.jsp" %>
    
    <h2>Custom Logout Page</h2>
    
    <form method="post" action="/java/customlogout.do">
    
    <div>
        <button class="out">로그아웃</button>
    </div>
    <!-- 
        POST, PUT, PATCH, DELETE > CSRF 토큰 
    9.2 배포/운영 > CSRF 방지 설정 On
    - POST 요청 페이지 > 토큰 설정 -->
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    </form>
    
    <script src="https://code.jquery.com/jquery-4.0.0.js"></script>
    <script src="https://code.jquery.com/ui/1.14.2/jquery-ui.js"></script>
    <script src="https://bit.ly/4cMuheh"></script>
    <script>
        
    </script>
</body>
</html>