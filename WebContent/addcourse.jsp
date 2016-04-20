<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Course</title>
</head>
<body>
	
	<c:if test="${sessionScope.user == null}">
		<c:redirect url="login.jsp"></c:redirect>
	</c:if>
	
	<center>
		<h2>Course Planner</h2>
			<form action="AddCourse" method="post">
				<table>
					<tr>
						<td>Course Id : </td>
						<td><input type="text" name="courseid"></td>
					</tr>
					<tr>
						<td>Course Code : </td>
						<td><input type="text" name="coursecode"></td>
					</tr>
					<tr>
						<td>Course Title : </td>
						<td><input type="text" name="coursetitle"></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" name="addcourse" value="Add Course"></td>
					</tr>
				</table>
			</form>
	</center>
</body>
</html>