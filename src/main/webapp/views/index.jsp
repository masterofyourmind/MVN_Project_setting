<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
-
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to shobhit Ranjan
	<form action="addAliens">
		Enter your id : <input type="text" name="aid"></br> Enter your name
		: <input type="text" name="aname"></br> <input type="submit">
	</form>

	<form action="getAlien" method="get">
		Enter your ID: <input type="text" name="aid"></br> <input
			type="submit">
	</form>

	<form action="getAliens" method="get">
		See all the available data 
		<input type="submit">
	</form>
</body>
</html>