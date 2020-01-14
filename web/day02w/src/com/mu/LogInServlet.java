package com.mu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet({ "/LogInServlet", "/login.jsp" })
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//System.out.println(id + " " + pwd);
		if(id.equals("coffee")&&
				pw.equals("milk")) {
			response.sendRedirect("loginsuc.html");
			
		}else {
			
			response.sendRedirect("loginfail.html");
		}
	}

}
