package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.dao.UserDao;
import com.vo.UserVO;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet({ "/UpdateServlet", "/update" })
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        dao= new UserDao();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		UserVO user = null;
		RequestDispatcher rd = null;
		
		try {
			user = dao.get(id);
				rd=	request.getRequestDispatcher("update.jsp");
				request.setAttribute("user", user);
		} catch (Exception e) {
	}
		rd.forward(request, response);
	}
}
