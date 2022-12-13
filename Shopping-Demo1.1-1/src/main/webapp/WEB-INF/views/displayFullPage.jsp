<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div align="center">
	<body bgcolor="Silver">
		<h1>Display Page</h1>
		<hr>

		First Name : ${personalBundle.firstName}
		<br> Email :${personalBundle.email}
		<br> Phone Number : ${personalBundle.phoneNumber}
	</body>

</div>
</html>