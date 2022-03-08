<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/content.css">
    <link rel="stylesheet" href="http://cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">
    <title>Seoul</title>
    <script src="index.js"></script>
</head>
<body>
    <!-- 헤더(상단) -->
    <header class="wrap">
        <jsp:include page="/WEB-INF/views/nav.jsp"/>
    </header>
    <!--헤더 끝-->

    <!--메인 시작-->    
    <main class="main" role="main">   
		<ul class="list">
			<li>
				<img src="${pageContext.request.contextPath }/resources/images/mat.jpg">
				<div class="caption">
					<h1>맛집</h1>
					<p>설명 텍스트</p>
				</div>
			</li>
			<li>
				<img src="${pageContext.request.contextPath }/resources/images/mye.jpg">
				<div class="caption">
					<h1>명소</h1>
					<p>설명 텍스트</p>
				</div>
			</li>
			<li>
				<img src="${pageContext.request.contextPath }/resources/images/hot.jpg">
				<div class="caption">
					<h1>호텔</h1>
					<p>설명 텍스트</p>
				</div>
			</li>
		</ul>        
    </main>      
    <!--메인 끝-->
    
    <!--푸터 시작-->
	<footer class="footer">		
		<jsp:include page="/WEB-INF/views/footer.jsp"/>
	</footer>
	<!--푸터 끝-->    
</body>
</html>
