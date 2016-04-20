<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Courses</title>
</head>
<body>
	
	<center>
		<h2>Course Planner</h2>
		
		<a href="ValidateUser">Logout</a>
		
		<h4>Welcome ${user}</h4>
		
		<table border="1">
			<tr>
				<th>Course ID</th>
				<th>Course Code</th>
				<th>Course Title</th>
				<th>Edit</th>
				<th>Remove</th>
			</tr>
			<c:forEach items="${courses}" var="c">
				<tr>
					<td>${c.id}</td>
					<td>${c.code}</td>
					<td>${c.title}</td>
					<td><a href="EditCourse?code=${c.code}">Edit</a></td>
					<td><a href="AddCourse?code=${c.code}">Remove</a></td>
				</tr>
			</c:forEach>
				
		</table>
		<br>
		<br>
		
		<a href="addcourse.jsp">Add New Course</a>		
		
	</center>
		
</body>
</html>