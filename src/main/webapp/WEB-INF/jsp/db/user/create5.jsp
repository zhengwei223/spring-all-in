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
<form action="user/new5" method="post">
<table>
<thead>
<tr>
<th>First Name</th>
<th>Last Name</th>
</tr>
</thead>
<tfoot>
<tr>
<td colspan="2"><input type="submit" value="Save" /></td>
</tr>
</tfoot>
<tbody>
<tr>
<td><input name="users['x'].firstName" value="aaa" /></td>
<td><input name="users['x'].lastName" value="bbb" /></td>
</tr>
<tr>
<td><input name="users['y'].firstName" value="ccc" /></td>
<td><input name="users['y'].lastName" value="ddd" /></td>
</tr>
<tr>
<td><input name="users['z'].firstName" value="eee" /></td>
<td><input name="users['z'].lastName" value="fff" /></td>
</tr>
</tbody>
</table>
</form>	
</body>
</html>