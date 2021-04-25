<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=" background-color:pink;">
<h2 style="float:right; color:blue;">Welcome ${sessionScope.user}</h2><br><br><br><br>

<h1>Select Book Category </h1>
<form action="GetBookServ">
<table border="6" cellspacing="8" cellpadding="10" style="background-color:yellow;">
<c:forEach items="${requestScope.bcat}" var="i">
<tr><td><input type="checkbox" name="bcat" value="${i}"></td><td>${i}</td></tr>
</c:forEach>
</table>
<br><br>
<input type="submit" value="Show books">
</form>
<br><br><br>
<h2 style="float:right; color:blue; text-decoration:none;"><a href="Logout.jsp">Logout</a></h2>
</body>

</html>