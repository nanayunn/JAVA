package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.vo.UserVO;


@WebServlet({ "/SelectServlet", "/select" })
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao dao;
    public SelectServlet() {
        super();
        dao = new UserDao();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<UserVO> list 
		= null;
		try {
			list = dao.get();
			
			RequestDispatcher rd = 
			request.getRequestDispatcher("select.jsp");
			request.setAttribute("clist", list);
			rd.forward(request, response);
			
		} catch (Exception e) {
			
		}
	}

}



