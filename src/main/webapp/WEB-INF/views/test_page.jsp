<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="date" />
	<input type="text" id="search" />
	<input type="button" id="btn" value="btn"/>
	
	<div id="div">
	</div>
	
	<script>
		const search = document.getElementById("search");
		const btn = document.getElementById("btn");
		const div = document.getElementById("div");
		
		btn.onclick=()=>{
			div.innerHTML = "";
			fetch("http://localhost/getjson?name="+search.value)
			.then(res=>res.json())
			.then(json=> {
				process(json);
				});
		}
		function process(json) {
			for(let i=0;i<json.length;i++){
				div.innerHTML += json[i].l_id + json[i].l_name ;
			}
		}
	</script>
</body>
</html>