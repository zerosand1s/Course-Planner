<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
	<form action="ValidateUser" method="post">
		<center>
			Username : <input type="text" name="user">
			<br>
			<br>
			<br>
			Password : <input type="password" name="password">
			<br>
			<br>
			<br>
			<input type="submit" name="login" value="Login">
		</center>
	</form>
	
</body>
</html>