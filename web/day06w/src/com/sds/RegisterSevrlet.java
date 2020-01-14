package com.sds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterSevrlet
 */
@WebServlet({ "/RegisterSevrlet", "/register" })
public class RegisterSevrlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = 
				request.getParameter("id");
		String pwd = 
				request.getParameter("pwd");
		if (id.contentEquals("pppppp")&&pwd.equals("pizzazoa")) {
			response.sendRedirect("ok.html");
		}else {
			response.sendRedirect("http://www.naver.com");
			
		}
		String name = 
				request.getParameter("name");
		String age = 
				request.getParameter("age");
		System.out.println(id+" "+pwd+" "+name+" "+age);
		
	}

}
