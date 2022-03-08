<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> index page </h1>
	
	
	 
	<c:if test="${not empty auth}">
		${auth.m_name }님
	</c:if>
	<br><br>
	<a href="/login">login</a><br>
	<a href="/tripinseoul">trip in seoul</a><br>
	<a href="/myplanner">my planner</a><br>
	<a href="/community">community</a><br>
	<a href="/FAQ?search=title&keyword=&p=1">FAQ</a><br>
	 
	<br><br>
	<a href="/testjson">test json</a><br>
	<a href="/test1">test file upload</a><br> 
	
	

	
</body>
</html>