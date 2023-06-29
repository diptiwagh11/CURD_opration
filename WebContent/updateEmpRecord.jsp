<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#form {
	border: 2px solid black;
	width: 30%;
	margin-left: 200px;
	padding: 15px;
}

h4 {
	margin-left: 20px;
}
}
</style>
</head>
<body>
	<h3>${updMsg}</h3>

	<form action="update" id="form">
		<h4>Update Form...</h4>
		<label>Id:</label> <input type="text" name="id"><br>
		<br> <label>First Name:</label>
		 <input type="text" name="fname"><br>
		<br> <label>Last Name:</label> 
		<input type="text" name="lname"><br>
		<br> <label>phone:</label>
		 <input type="text" name="number"><br>
		<br> <label>UserName:</label> <input type="text" name="userName"><br>
		<br> <label>Password:</label> <input type="password"
			name="password"><br>
		<br> <input id="button" type="submit" value=" Update">

	</form>


</body>
</html>