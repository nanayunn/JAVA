package com.sds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterOk
 */
@WebServlet({ "/RegisterOk", "/registerok" })
public class RegisterOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String cmd = request.getParameter("cmd");
//		if(cmd.contentEquals("y")) {
//			
//		}else {
//			
//		}
		String id = 
				(String)request.getAttribute("id");
		
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<H1>Result Page</H1>");
		out.print("<H1>Result OK</H1>");
		out.close();
	}

}
