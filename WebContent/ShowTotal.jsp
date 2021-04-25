<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:pink;">
<h2 style="float:right; color:blue;">Welcome ${sessionScope.user}</h2><br><br><br><br>


<form action="Success.jsp">
Total price: <input type="text" value="${requestScope.total}"><br><br>
<input type="submit" value="Pay">
</form>
<br><br><br>
<h2 style="color:blue;"><a style=' text-decoration:none;' href="Homeserv">Home</a>
<a style='float:right; text-decoration:none;'href="Logout.jsp">Logout</a></h2>


</body>
</html>