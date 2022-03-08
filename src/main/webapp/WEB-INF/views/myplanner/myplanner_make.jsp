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
	<h1> make planner</h1>
	[ planner map ]<br>
	<c:forEach var="locs" items="${addedLoc }">
		--${locs.key }--
		  <c:forEach var="val" items="${locs.value }">
		  	${val.l_name }
		  </c:forEach>
		  <br>
	</c:forEach>
	
	<!-- get request -->
	<form action="/myplanner/make" method="get" >
	selected key : 
	<input type="text" name="index" id="index"/>
	<br>
	시작날짜 <input type="date" name="stdate" id="start_date" value="${stdate }"/><br>
	종료날짜 <input type="date" name="eddate" id="end_date" value="${eddate }"/>
	
	<div id="dates">
		
	</div>
	<br><br>
	추가한 리스트  
	<c:forEach var="loc" items="${addedLoc }">
		${loc}
	</c:forEach>
	<br><br>
	선택할 리스트 
	<c:forEach var="loc" items="${foundLoc }">
		<button type="submit" name="choice" id="choiceBtn"
		value="${loc.l_id}"/>${loc.l_name}</button>
		
	</c:forEach>
	<br>
	<input type="text" name="searchKeyword"/>
	<input type="submit" name="searchBtn" id="searchBtn" value="검색"/>
	
	</form>
	
	<br><br>
	
	<!-- post request -->
	<form action="/myplanner/make" method="post">
		<input type="submit" value="complete"/>
	</form>
	
	<!-- java script -->
	<jsp:include page="/WEB-INF/views/myplanner/myplanner_make_script.jsp"/>
</body>
</html>