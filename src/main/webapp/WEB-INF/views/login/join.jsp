<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> join page</h1>
	
	<form action="/join" method="POST">
		id<input type="text" name="m_id"/><br>
		pw<input type="text" name="m_password"/><br>
		email<input type="text" name="m_email"/><br>
		name<input type="text" name="m_name"/><br>
		nickname<input type="text" name="m_nickname"/>
		gender<select name="m_gender">
				<option value="male">male</option>
				<option value="female">female</option>
			</select><br>
		
					
		<input type="submit" value="submit"/>
	</form>
	
	
</body>
</html>