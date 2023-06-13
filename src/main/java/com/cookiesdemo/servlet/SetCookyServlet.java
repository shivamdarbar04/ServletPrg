package com.cookiesdemo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accept")
public class SetCookyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		 String uname = request.getParameter("txtName");
		 String choice = request.getParameter("radSite");
		 String site = "";
		 
		 switch(choice)
		 {
		 case "f":
		 site="www.facebook.com";
		 break;
		 
		 case"i":
		 site="www.instagram.com";
		 break;
		 
		 case "t":
		 site = "www.twitter.com";
		 }
		 
		 Cookie cn = new Cookie("namecooky",uname);
		 Cookie cs = new Cookie("sitecooky",site);
		 
		 cn.setMaxAge(120);
		 cs.setMaxAge(120);
		 
		 response.addCookie(cn);
		 response.addCookie(cs);
	}

}
