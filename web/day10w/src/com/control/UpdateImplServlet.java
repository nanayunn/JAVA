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
 * Servlet implementation class UpdateImplServlet
 */
@WebServlet({ "/UpdateImplServlet", "/updateimpl" })
public class UpdateImplServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao dao;
  
    public UpdateImplServlet() {
        super();
        dao= new UserDao();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		UserVO user = new UserVO(id, pwd, name);
		RequestDispatcher rd = null;
		try {
			dao.update(user);
			request.setAttribute("user", user);
			rd = request.getRequestDispatcher("get.jsp");
			//response.sendRedirect("get?id="+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rd.forward(request, response);
	}

}
