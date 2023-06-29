<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  #form{
    border:2px solid black;
     width:30%;
    margin-left:200px;
    padding:15px;
  }
  h4{
      margin-left:20px;
   }
   
   table, th, tr, td {
	border: 1px solid black;
}

h3 {
	margin-left: 50px;
}
</style>
</head>
<body>
<h4>select Record...</h4>
  <form action="select" method="post">
   <label>Id:</label>
      <input type="text" name="id"><br><br>
     
      <input id="button" type="submit" value=" select">
  
   </form>
   
   <div id="box">
		<h3>Selected Record</h3>
		<table>
			<tr>
				<th>Id</th>
				<th>fName</th>
				<th>lName</th>
				<th>mobile</th>
				<th>userName</th>
				<th>password</th>
				
			</tr>
			<tr>
			    <td>${id}</td>
				<td>${fname}</td>
				<td>${lname}</td>
				<td>${mobile}</td>
				<td>${userName}</td>
				<td>${password}</td>
	

			</tr>
		</table>
	</div>

</body>
</html>