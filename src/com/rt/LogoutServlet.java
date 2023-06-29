package com.rt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     
		Cookie ck =new Cookie("username","");
		ck.setMaxAge(0);
		res.addCookie(ck);
		
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.include(req, res);
		
	}
}
