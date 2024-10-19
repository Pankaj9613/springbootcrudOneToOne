<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<table border="1px" align="center">
		<tr>
			<th>ID</th>
			<th>AID</th>
			<th>NAME</th>
			<th>USERNAME</th>
			<th>AREANAME</th>
			<th>CITYNAME</th>
			<th>PASSWORD</th>
			<th>ACTION</th>
		</tr>
		<c:forEach items="${data}" var="s">
		<tr>
			<th>${s.id}</th>
			<th>${s.addr.aid}</th>
			<th>${s.name}</th>
			<th>${s.username}</th>
			<th>${s.addr.areaname}</th>
			<th>${s.addr.cityname}</th>
			<th>${s.password}</th>
			<th><a href="delete?id=${s.id}">DELETE</a>||<a href="edit?id=${s.id}">EDIT</a></th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>