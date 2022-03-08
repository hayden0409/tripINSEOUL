<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <nav class="navbar">
            <!--로고-->
            <div class="navbar_logo">
                <a href="/"><img src="${pageContext.request.contextPath }/resources/images/logo_top.png" alt="logo">
                <b>Trip IN SEOUL</b></a>
            </div>

            <!--메뉴-->
            <ul class="navbar_menu">         
                <li><a href="/intro">Trip IN SEOUL</a></li>
                <li><a href="/tour">여행지</a></li>
                <li><a href="">플래너 만들기</a></li>
                <li><a href="">커뮤니티</a></li>
                <li><a href="">FAQ</a></li>
            </ul>

            <!--로그인/회원가입-->
            <ul class="navbar_login">
                <li><i class="xi-user"></i>
                    <a href="#">LOGIN</a>
                </li>
                <li><i class="xi-user-plus-o"></i>
                    <a href="#">JOIN</a>
                </li>
            </ul>
        </nav>
</body>
</html>