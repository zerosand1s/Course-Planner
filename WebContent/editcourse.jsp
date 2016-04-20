<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Course</title>
</head>
<body>
	
	<center>
		<h2>Course Planner</h2>
			<form action="EditCourse" method="post">
				<table>
					<tr>
						<td>Course Id : </td>
						<td><input type="text" name="cid" value="${course.id}"></td>
					</tr>
					<tr>
						<td>Course Code : </td>
						<td><input type="text" name="ccode" value="${course.code}"></td>
					</tr>
					<tr>
						<td>Course Title : </td>
						<td><input type="text" name="ctitle" value="${course.title}"></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" name="editcourse" value="Edit Course"></td>
					</tr>
				</table>
			</form>
	</center>
	
</body>
</html>