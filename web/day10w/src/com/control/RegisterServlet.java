package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.vo.UserVO;


@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserDao dao;
	
    public RegisterServlet() {
        super();
        dao = new UserDao();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?id=xxx&pwd=aaa&name=Çö¼ö
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		//System.out.println(id+" "+pwd+" "+name);
		
		try {
			UserVO user = new UserVO(id, pwd, name);
			dao.insert(user);
			//OK
			RequestDispatcher rd = 
			request.getRequestDispatcher("registerok.jsp");
			request.setAttribute("id", id);
			rd.forward(request, response);
			
		} catch (Exception e) {
			// FAIL
			response.sendRedirect("registerfail.jsp");
		} 

	}

}




