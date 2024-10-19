<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update"> 

<input type="hidden" name="id" value="${data.id}"> <br><br>
<input type="hidden" name="id" value="${data.addr.aid}"> <br><br>
name    :<input type="text" name="name" value="${data.name}"> <br><br>
usernsame:<input type="text" name="username" value="${data.username}"><br><br> 
mobile:<input type="text" name="mobile" value="${data.mobile}"><br><br> 
areaname:<input type="text" name="addr.areaname" value="${data.addr.areaname}"><br><br> 
cityname:<input type="text" name="addr.cityname" value="${data.addr.cityname}"><br><br> 
password:<input type="text" name="password" value="${data.password}"> <br><br>
<input type="submit" value="update"> 

</form>
</body>
</html>