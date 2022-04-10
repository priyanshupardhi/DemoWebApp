package com.priyanshu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {
	
	
      public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	  int i = Integer.parseInt(req.getParameter("num1"));
    	  int j = Integer.parseInt(req.getParameter("num2"));
    	  
    	  int k = i+j;
    	  
    	  PrintWriter ans = res.getWriter();
    	  
    	  ans.println("Ans is "+ k);
      }
}
