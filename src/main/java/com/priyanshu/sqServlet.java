package com.priyanshu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("k");
		k= k*k;
		PrintWriter out = res.getWriter();
		out.println(k);
	}
}
