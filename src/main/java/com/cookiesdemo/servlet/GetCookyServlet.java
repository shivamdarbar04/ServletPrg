package com.cookiesdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookyServlet")
public class GetCookyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter pw = response.getWriter();
    
    String uname =  "" ,site="";
    
    Cookie[] arr = request.getCookies();
    for(Cookie c : arr)
    {
    	if(c.getName().equals("namecooky"))
    		uname=c.getValue();
    		
    	if(c.getName().equals("sitecooky"))
    	site = c.getValue();
    }
	   
	}

}
