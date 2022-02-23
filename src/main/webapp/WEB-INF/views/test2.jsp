<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1> test page 2</h1>
 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${tl}" var="tl">
                <tr>
                    <td>${tl.id}</td>
                    <td>${tl.pw}</td>
                    <td>${tl.name}</td>
                </tr>
            </c:forEach> 
        </tbody>
    </table>
 
 
</body>
</html>
