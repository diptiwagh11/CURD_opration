package com.rt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("userName");
		String password = req.getParameter("password");
		int count=0;
		try {
	        Class.forName("com.mysql.jdbc.Driver");	 
  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee-record", "root", "root");
            PreparedStatement ps=con.prepareStatement("SELECT count(*) from  emp_record where username=? and password=?");
	
		    ps.setString(1, username);
		    ps.setString(2, password);
		    ResultSet rs=ps.executeQuery();
		    rs.next();
		    count=rs.getInt(1);
		    
		} catch (Exception e) {

		   System.out.println(e);
		}

		if(count==1){
			Cookie ck=new Cookie("username",username);
			res.addCookie(ck);
			RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
			rd.include(req,res);
		}else{
			req.setAttribute("errMsg","Wrong User..." );
			RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			rd.include(req,res);
		}

	}
		
		
	}


