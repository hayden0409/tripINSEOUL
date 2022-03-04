<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1> trip in seoul main</h1>
	<h2>Hot Place</h2>
	<c:forEach var="cat1" items="${cat1List }">
		<a href="/tripinseoul/select1?c1=${cat1.c1_id}">${cat1.c1_name }</a>
	</c:forEach>
	
	<br>
	
</body>
</html>