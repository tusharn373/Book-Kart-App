<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Logout Successful!!</h2>
<br>
<a style='text-decoration:none;'href="Login.jsp">Login to continue....</a>


<%
session.invalidate();
%>

</body>

</html>