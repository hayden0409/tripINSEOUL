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
	<h1> trip in seoul select1</h1>
	<c:forEach var="cat2" items="${cat2List }">
		<a href="/tripinseoul/select2?c1=${c1 }&c2=${cat2.c2_id}">
			${cat2.c2_name}
		</a>
		<br>
	</c:forEach>
	
</body>
</html>