package com.mu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogInservlet
 */
@WebServlet({ "/LogInservlet", "/login" })
public class LogInservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//System.out.println(id + " " + pwd);
		if(id.equals("qq")&&
				pwd.equals("11")) {
			response.sendRedirect("e1.html");
			
		}else {
			
			response.sendRedirect("e1.html");
		}
	}

}
