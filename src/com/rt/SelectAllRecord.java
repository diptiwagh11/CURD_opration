package com.rt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectAllRecord extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
	         Class.forName("com.mysql.jdbc.Driver");	 
  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyee-record", "root", "root");
            PreparedStatement ps=con.prepareStatement("select * from emp_record");
		    
		     ResultSet rs=ps.executeQuery();
		     ArrayList<EmpRecordEntity> userList=new ArrayList<EmpRecordEntity>();
		    while( rs.next()){
		     int id=rs.getInt(1);
		     String fname=rs.getString(2);
		     String lname=rs.getString(3);
		     String number=rs.getString(4);
		     String userName=rs.getString(5);
		     String password=rs.getString(6);
		     
		     EmpRecordEntity e=new EmpRecordEntity(id, fname, lname, number, userName, password);
		     userList.add(e);
		    }
		    
		    req.setAttribute("userList",userList);
			 RequestDispatcher rd = req.getRequestDispatcher("selectAllEmpRecord.jsp");
				rd.forward(req, res);
			    
		    
		   con.close();
		    
		} catch (Exception e) {

		   System.out.println(e);
		}
        
	}

}
