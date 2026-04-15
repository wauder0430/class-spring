<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
</head>
<body>
    <!-- index.jsp -->
    <%@include file="/WEB-INF/views/inc/header.jsp" %>
    
    <h2>Index Page</h2>
    
    <p>모든 사용자가 접근 가능합니다.</p>
    
    <hr>
    
    <h3>접속한 유저 정보</h3>
    
    <div class="message" title="principal">
        <!-- Authentication -->
        <sec:authentication property="principal"/>
    </div>
    
    <sec:authorize access="isAuthenticated()">
    <div class="message" title="사용자 아이디">
        <sec:authentication property="principal.username"/>
    </div>
    
    <div class="message" title="사용자 권한">
        <sec:authentication property="principal.authorities"/>
    </div>
    
    <div class="message" title="사용자 이메일">
        <sec:authentication property="principal.dto.email"/>
    </div>
    
    <div class="message" title="사용자 이름">
        <sec:authentication property="principal.dto.membername"/>
    </div>
    
    <div class="message" title="사용자 성별">
        <sec:authentication property="principal.dto.gender"/>
    </div>
    </sec:authorize>
 
    <script src="https://code.jquery.com/jquery-4.0.0.js"></script>    
    <script src="https://bit.ly/4cMuheh"></script>
    <script>
    
    </script>
</body>
</html>






