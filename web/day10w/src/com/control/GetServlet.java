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

/**
 * Servlet implementation class GetServlet
 */
@WebServlet({ "/GetServlet", "/get" })
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServlet() {
        super();
        dao=new UserDao();
        // TODO Auto-generated constructor stub
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
				rd=	request.getRequestDispatcher("get.jsp");
				request.setAttribute("user", user);
		} catch (Exception e) {
			rd = request.getRequestDispatcher("error.jsp");
			e.printStackTrace();
		}
		rd.forward(request, response);
		
	}

}
