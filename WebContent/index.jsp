<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  a{
    text_decoration:none;
    
  }
  .emp{
     border:1px solid black;
     margin:10px;
     padding:5px;
     display:inline-block;
     border-radius:20px;
  }
</style>
</head>
<body>
<h3>${errMsg}</h3>
<h2>Welcome To Servlet..</h2>
<div class="emp">
<a href="login.jsp">Login</a>
</div>
<div class="emp">+

<a href="addEmpRecord.jsp">Add_Record</a>
</div>
<div class="emp">
<a href="deleteEmpRecord.jsp">Delete_Record</a>
</div>
<div class="emp">
<a href="updateEmpRecord.jsp">Upadate_Record</a>
</div>
<div class="emp">
<a href="selectemprecord.jsp">Select_Record</a>
</div>
<div class="emp">
<a href="selectAllEmpRecord">SelectAll_Record</a>
</div>


</body>
</html>