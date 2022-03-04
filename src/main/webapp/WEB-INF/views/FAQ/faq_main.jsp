<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>faq main</h1><br>
	<form action="/FAQ">
	<select name="search">
		<option value="title">title</option>
		<option value="content">content</option>
	</select>
	<input type="text" name="keyword"/>
	<input type="submit" value="submit"/>
	
	</form>
	<table border="1">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>content</td>
			<td>regdate</td>
		</tr>
	
		<c:forEach var="ib" items="${ibList }">
		<tr>
			<td>${ib.m_id }</td>
			<td>${ib.ib_title }</td>
			<td>${ib.ib_content }</td>
			
			
			 <td>
				<fmt:formatDate 
				pattern="yyyy-MM-dd a HH:mm:ss" 
				value="${ib.ib_regdate }"/>
			</td>
		</tr>
		</c:forEach>
	
	
	</table>
	total page : ${totalPage}<br>
	
	<c:forEach var="page" begin="1" end="${totalPage}">
		<a href="/FAQ?search=${search}&keyword=${keyword}&p=${page}">${page}</a>
	</c:forEach>
	
	
</body>
</html>