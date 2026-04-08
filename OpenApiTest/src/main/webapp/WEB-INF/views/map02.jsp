<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
    <style>
        #map {
            width: 770px;
            height: 500px;
        }
    </style>
</head>
<body>
    <!-- map02.jsp -->
    <h1>Kakao Map <small>좌표 이동 / 레벨 변경</small></h1>
    
    <div>
    <div id="map"></div>
    </div>
    <hr>
    <div>
        <input type="button" value="쌍용교육센터로 이동하기" id="btn1">
        <input type="button" value="선릉역으로 1번 출구로 이동하기" id="btn2">
        <input type="button" value="석촌호수로 이동하기" id="btn3">
    </div>
    <hr>
    <div>
        <input type="button" value="확대하기" id="btn4">
        <input type="button" value="축소하기" id="btn5">
    </div>
    
    
    
    
    <script src="https://code.jquery.com/jquery-4.0.0.js"></script>
    <script src="https://code.jquery.com/ui/1.14.2/jquery-ui.js"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=63d5ac7c4e164023089431bd20c2742c"></script>
    <script src="https://bit.ly/4cMuheh"></script>
    <script>
    var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
    var options = { //지도를 생성할 때 필요한 기본 옵션
        center: new kakao.maps.LatLng(37.50472, 127.0532), //지도의 중심좌표.
        level: 3 //지도의 레벨(확대, 축소 정도)
    };

    var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
    
    map.setDraggable(false);
    map.setZoomable(false);
    
    $('#btn1').click(()=>{
    	const pos = new kakao.maps.LatLng(37.50472, 127.0532);
    	//map.setCenter(pos);
    	map.panTo(pos);
    });
    $('#btn2').click(()=>{
        const pos = new kakao.maps.LatLng(37.50462, 127.0501);
        //map.setCenter(pos);
        map.panTo(pos);
    });
    $('#btn3').click(()=>{
        const pos = new kakao.maps.LatLng(37.50880, 127.1000);
        //map.setCenter(pos);
        map.panTo(pos);
    });
    $('#btn4').click(()=>{
        //map.setLevel(1);
        map.setLevel(map.getLevel() - 1);
    });
    $('#btn5').click(()=>{
        //map.setLevel(14);
    	map.setLevel(map.getLevel() + 1);
    });
    
    </script>
    
</body>
</html>