package com.sds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	userDao dao;
	UserVO vo;
	
    public RegisterServlet() {
        super();
       dao=new userDao();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?id=xxx&pwd=aaa&name=dhkd
		
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		
		
		response.setContentType("text/html:charset=EUC-KR");
		PrintWriter out = response.getWriter();
		try {
			dao.insert(vo);
			RequestDispatcher rd =
			request.getRequestDispatcher("registerok.jsp");
			request.setAttribute("id", id);
			//response.sendRedirect("resgisterok");
			rd.forward(request, response);
			//OK
			//out.print("<H1>Result Page</H1>");
			//out.print("<H2>Register OK</H2>");
		} catch (Exception e) {
			response.sendRedirect("registerfail.jsp");
//			out.print("<H1>Result Page</H1>");
//			out.print("<H2>Register Fail</H2>");
			//FAIL
		}
		//out.close();
		//System.out.println(id +" "+pwd+" "+name);
	}

}
