<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user/new7" method="post">
		<input name="firstName" value="张" type="text" /> 
		<input
			name="lastName" value="三" type="text" /> 
			<br>
		<input type="checkbox" name="hobbies" value="a">a
		<input type="checkbox" name="hobbies" value="b">b
		<input type="checkbox" name="hobbies" value="c">c
		<input type="checkbox" name="hobbies" value="d">d	
			<input type="submit">
	</form>
</body>
</html>