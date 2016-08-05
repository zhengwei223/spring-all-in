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
	<form action="user/new2" method="post">
		<input name="firstName" value="张" /><br> 
		<input name="lastName" value="三" /><br> 
		<input name="contactInfo.tel" value="13809908909" /><br> 
		<input name="contactInfo.address" value="北京海淀" /><br> 
		<input type="submit" value="Save" />
	</form>
</body>
</html>