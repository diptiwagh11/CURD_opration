   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
  #form{
    border:2px solid black;
    width:30%;
   margin-left:200px;
   padding:15px;
  }
  h4{
      margin-left:20px;
   }
</style>
</head>
<body>
<h4>Delete Record...</h4>

<h4>${deletemsg}</h4>
  <form action="delete" id="form">
   <label>Id:</label>
      <input type="text" name="id"><br><br>
     
      <input id="button" type="submit" value=" Delete">
  
   </form>

</body>
</html>