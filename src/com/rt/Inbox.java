package com.rt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inbox extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String username=null;
		Cookie cks[]=req.getCookies();
		if(cks!=null){
			for(Cookie ck:cks){
				String key=ck.getName();
				if(key.equals("username")){
					username=ck.getValue();
				}
			}
		}
		
		if(username==null){
			req.setAttribute("err","login first" );
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.include(req, res);
		}else{
			PrintWriter pw=res.getWriter();
			pw.write("<h1>welcome to "+username+"</h1>");
			pw.write("<a href='logout'>LogOut</a>");
		}
	}
}
