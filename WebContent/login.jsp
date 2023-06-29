<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		#box{

               border: 1px solid black;
               margin-left: 200px;
               margin-top: 20px;
               width:30%;
               padding:20px; 
               background:#999;  
              
          }
          h4{
           text-align:center
           
          }
          
          #button{
          
           margin-left: 100px;
           background:lightblue; 
           width:60px;
           height:30px;
          }
          
          a{
             margin-left: 110px;
          }
          
          p{
            text-align:center
          }
		
	</style>
</head>
<body>

<div id="box">
<h2>${errMsg}</h2>
<form action="login">

<h4>Login Page...</h4>
<p>Please login to your account</p>
<hr>
      
     <label>UserName:</label>
      <input type="text" name="userName"><br><br>
      
      <label>Password:</label>
      <input type="password" name="password"><br><br>
     
      <input id="button" type="submit" value="login"><br>
      <a href="addEmpRecord.jsp">Sing_Up</a>
</form>
</div>

</body>
</html>