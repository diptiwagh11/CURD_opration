package com.rt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mobile = req.getParameter("number");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");

		try {
	        Class.forName("com.mysql.jdbc.Driver");	 
  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee-record", "root", "root");
            PreparedStatement ps=con.prepareStatement("insert into emp_record(`fname`,`lname`,`mobile`,`username`,`password`)values(?,?,?,?,?)");
		    ps.setString(1, fname);
		    ps.setString(2, lname);
		    ps.setString(3, mobile);
		    ps.setString(4, userName);
		    ps.setString(5, password);
		    int rs=ps.executeUpdate();
		    
		    if(rs==1){
		    	req.setAttribute("errMsg", "Record Add Successfully");
		    }else{
		    	req.setAttribute("errMsg", "Unable to add");
		    }
		    
		} catch (Exception e) {

		   System.out.println(e);
		}

		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, res);

	}

}
