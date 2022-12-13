<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function showPopup() {

		alert("Data Added Successfullly....")
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="center">
		<h1>Proofs Page</h1>
		<hr>

		<form:form action="/proofPageSaver" modelAttribute="proofBundle">

			<label for="pc"> Pan Card: </label>
			<form:input path="pancard" id="pc" />

			<br>
			<br>
			<label for="ad"> Aadhaar Card: </label>
			<form:input path="aadhaar" id="ad" />
			<br>
			<br>
			<input onclick="showPopup()" type="submit" value="Save" />

		</form:form>
		<br>
		<form action="/pay">

			<input type="submit" value="Submit" />

		</form>


	</div>
</body>
</html>