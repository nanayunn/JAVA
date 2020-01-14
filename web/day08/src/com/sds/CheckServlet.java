package com.sds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet({ "/CheckServlet", "/check" })
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String result = "";
		if(id.equals("aaaa")||
				id.equals("bbbb")||
				id.equals("cccc")||
				id.equals("dddd")
				) {
			result = "1";
		}else {
			result = "0";
		}
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}
