<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/style.css">
    <link rel="stylesheet" href="http://cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick.css" />
    <link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick-theme.css" />
    <script src="http://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g=" crossorigin="anonymous"></script>
    <script type="text/javascript" src="http://kenwheeler.github.io/slick/slick/slick.min.js">
	</script>
    <title>index</title>
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
       <div class="slick-items">
            <div>
              <img src="${pageContext.request.contextPath }/resources/images/main.jpg" alt="">
            </div>
            <div>
              <img src="${pageContext.request.contextPath }/resources/images/1.jpg" alt="">
            </div>
            <div>
              <img src="${pageContext.request.contextPath }/resources/images/2.jpg" alt="">
            </div>
            <div>
              <img src="${pageContext.request.contextPath }/resources/images/3.jpg" alt="">
            </div>
        </div>
        <!--검색창-->
        <div class="main-container">
            <form class="box">
                <h1>What are you looking for?</h1>
                <input type="text" placeholder="찾고 싶은 여행지를 검색해보세요.">
                <input type="submit" value="Search">
            </form>
        </div>
    </main>   
    <!--메인 끝-->
    
    <!--푸터 시작-->
	<footer class="footer">		
		<jsp:include page="/WEB-INF/views/footer.jsp"/>
	</footer>
	<!--푸터 끝-->
	
	<script type="text/javascript">
        $(document).ready(function () {
            //alert('123');
            $('.slick-items').slick({
                autoplay : true,
                dots: true,
                speed : 300 /* 이미지가 슬라이딩시 걸리는 시간 */,
                infinite: true,
                autoplaySpeed: 3000 /* 이미지가 다른 이미지로 넘어 갈때의 텀 */,
                arrows: true,
                slidesToShow: 1,
                slidesToScroll: 1,
                fade: false
            });
        });
    </script>
</body>
</html>