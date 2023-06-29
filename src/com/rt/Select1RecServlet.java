package com.rt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Select1RecServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mobile = req.getParameter("number");
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		try {
	         Class.forName("com.mysql.jdbc.Driver");	 
  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee-record", "root", "root");
            PreparedStatement ps=con.prepareStatement("select * from emp_record where id=?");
		     ps.setInt(1, id);
		     ResultSet rs=ps.executeQuery();
		     rs.next();
		     req.setAttribute("id", rs.getInt(1));
		     req.setAttribute("fname", rs.getString(2));
		     req.setAttribute("lname", rs.getString(3));
		     req.setAttribute("mobile", rs.getString(4));
		     req.setAttribute("userName", rs.getString(5));
		     req.setAttribute("password", rs.getString(6));
		     
		     con.close();
		    
		   
		    
		} catch (Exception e) {

		   System.out.println(e);
		}

		RequestDispatcher rd = req.getRequestDispatcher("selectemprecord.jsp");
		rd.forward(req, res);
		

	}

}
