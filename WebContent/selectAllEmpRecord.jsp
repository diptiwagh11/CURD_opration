<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, th, tr, td {
	border: 1px solid black;
}

h3 {
	margin-left: 50px;
}
</style>
</head>
<body>
<form action="selectAll"></form>
	<div id="box">
		<h3>AllRecord</h3>
		<table>
			<tr>
				<th>Id</th>
				<th>fName</th>
				<th>lName</th>
				<th>mobile</th>
				<th>userName</th>
				<th>password</th>
			</tr>
			<c:forEach var="user" items="${userList}">
			<tr>
				 <td>${user.id}</td>
				<td>${user.fname}</td>
				<td>${user.lname}</td>
				<td>${user.number}</td>
				<td>${user.userName}</td>
				<td>${user.password}</td>
			</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>