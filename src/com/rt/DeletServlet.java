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

public class DeletServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		try {
	         Class.forName("com.mysql.jdbc.Driver");	 
  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee-record", "root", "root");
            PreparedStatement ps=con.prepareStatement("delete from  emp_record where id=?");
		     ps.setInt(1, id);
		     int rs=ps.executeUpdate();
			    
			    if(rs==1){
			    	req.setAttribute("deletemsg", "Record delet Successfully");
			    }else{
			    	req.setAttribute("deletemsg", "Unable to delete");
			    }
		     con.close();
		    
		   
		    
		} catch (Exception e) {

		   System.out.println(e);
		}

		RequestDispatcher rd = req.getRequestDispatcher("deleteEmpRecord.jsp");
		rd.forward(req, res);
		

	}

}
