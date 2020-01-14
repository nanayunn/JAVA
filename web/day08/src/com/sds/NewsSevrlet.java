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
 * Servlet implementation class NewsSevrlet
 */
@WebServlet({ "/NewsSevrlet", "/news" })
public class NewsSevrlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<news> list =
						new ArrayList<>();
			list.add(new news(1, "축구", 1));
			list.add(new news(2, "한국브라질", 0));
			list.add(new news(3, "한국축구", 1));
			list.add(new news(4, "피파순위", 0));
			list.add(new news(5, "아시아축구", 1));
			
			JSONArray ja = new JSONArray();
			for (news news : list) {
				JSONObject obj =
						new JSONObject();
				obj.put("rank", news.getRank());
				obj.put("title", news.getTitle());
				obj.put("ud", news.getUd());
				ja.add(obj);
			}
			
			response.setCharacterEncoding("EUC-KR");
			response.setContentType("text/json; charset=EUC-KR");
			PrintWriter out = response.getWriter();
			out.write(ja.toJSONString());
			out.close();
	}

}
