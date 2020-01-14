package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegisterOkServlet", "/registerok" })
public class RegisterOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =
		(String)request.getAttribute("id");
		
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<h1>Result Page</h1>");
		out.print("<h1>"+id+" Register OK</h1>");
		
		
		
		out.close();
	}

}





