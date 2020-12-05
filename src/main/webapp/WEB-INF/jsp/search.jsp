<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<body>
	<center>
	<form action="${pageContext.request.contextPath}/contacts-api/search-id" , method="get">
		<input type="text" id = "cId" Placeholder = "Enter ID">
		<input type="submit" value="Search">
	</form>
	</center>
</body>
</html>