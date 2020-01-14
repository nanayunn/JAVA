package com.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet({ "/DeleteServlet", "/delete" })
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao dao;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public DeleteServlet() {
		super();
		dao= new UserDao();
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		try {
			dao.delete(id);
			response.sendRedirect("select");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
