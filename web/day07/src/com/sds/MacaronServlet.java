package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class MacaronServlet
 */
@WebServlet({ "/MacaronServlet", "/macaron" })
public class MacaronServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<macaron> list = new ArrayList<>();
		list.add(new macaron(1, "Strawberry", 1000, 4, "img/m1.jpg"));
		list.add(new macaron(2, "Chocolate", 1000, 5, "img/m2.jpg"));
		list.add(new macaron(3, "Vanilla", 1000, 3, "img/m3.jpg"));
		list.add(new macaron(4, "Lemon", 1000, 7, "img/m4.jpg"));
		list.add(new macaron(5, "Red Velvet", 2000, 6, "img/m5.jpg"));
		
		JSONArray ja = new JSONArray();
		for (macaron macaron : list) {
			JSONObject obj =
					new JSONObject();
			obj.put("id", macaron.getId());
			obj.put("name", macaron.getName());
			obj.put("price", macaron.getPrice());
			obj.put("stock", macaron.getStock());
			obj.put("img", macaron.getImg());
			ja.add(obj);
		}
		
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/json; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.write(ja.toJSONString());
		out.close();
	}

}
