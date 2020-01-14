package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.vo.UserVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    UserDao dao;
    public LoginServlet() {
        super();
        dao=new UserDao();
    }

	//LOGOUT 에 쓰입니다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session
		=request.getSession();
		if(session !=null) {
			session.invalidate();
		}
		response.sendRedirect("index.jsp");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//LOGIN에 쓰입니다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String pwd =request.getParameter("pwd");
		UserVO dbuser = null;
		RequestDispatcher rd = null;
		String next = "index.jsp";
		try {
			dbuser = dao.get(id);
			if(pwd.contentEquals(dbuser.getPwd())) {
				HttpSession session
				=request.getSession();
				session.setAttribute("loginuser", dbuser);
			}else {
				request.setAttribute("msg", "PASSWORD ERROR");
				next = "error.jsp";
			}
		} catch (Exception e) {
			request.setAttribute("msg", "LOGIN ERROR");
			next = "error.jsp";
		}
		rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
