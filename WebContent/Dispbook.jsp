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

<h3>Select Books to purchase </h3>
<form action="GetTotalServ">
<table border="6" cellspacing="8" cellpadding="5" style="background-color:yellow;">
<c:forEach items="${requestScope.blist}" var="b">
<tr><td><input type="checkbox" name="bid" value="${b.getbid()}"></td>
<td>${b.getbid()}</td>
<td>${b.getbname()}</td>
<td>${b.getbAuthor()}</td>
<td>${b.getbcategory() }</td>
<td>${b.getbPrice() }</td>
</tr>
</c:forEach>
</table>
<br><br>
<input type="submit" value="Show Total">
</form>
<br><br><br>
<h2 style="color:blue;"><a style=' text-decoration:none;' href="Homeserv">Home</a>
<a style='float:right; text-decoration:none;'href="Logout.jsp">Logout</a></h2>
</body>

</html>