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
	<h1> community </h1>
	
	<form action="/community">
	<select name="searchType">
		<option value="b_title">제목</option>
		<option value="b_content">내용</option>
	</select>
	<input type="text" name="keyword"/>
	<input type="submit" value="submit"/> 
	<br>
	<input type="radio" name="cat" value="all" checked>all</input>
	<input type="radio" name="cat" value="힐링">힐링</input>
	<input type="radio" name="cat" value="우정">우정</input>
	</form>
	
	
	
	
	<br>
	<c:forEach var="board" items="${boardList }">
		<span style="border:1px solid black">
			
			<a href="/community/detail?id=${board.b_id }">${board.b_title }</a>
			${board.b_content }
			${board.b_goodcnt }
			${board.b_cat }
		</span>
		<br>
	</c:forEach>
	
	
	
	
</body>
</html>