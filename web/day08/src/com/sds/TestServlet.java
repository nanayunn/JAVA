package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet({ "/TestServlet", "/test" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/event-stream;charset=utf-8");
				Date time = new Date();
				PrintWriter out = response.getWriter();
				//System.out.println("data:"+time.toString());
				ArrayList<marker> list = new ArrayList<>();
				list.add(new marker("카카오", 33.450705, 126.570677));
				list.add(new marker("생태연못", 33.450936, 126.569477));
				list.add(new marker("텃밭", 33.450879, 126.569940));
				list.add(new marker("근린공원", 33.451393, 126.570738));
				
					JSONArray ja = new JSONArray();
					for(marker marker:list) {
						JSONObject obj = new JSONObject();
						obj.put("title", marker.getTitle());
						obj.put("lat", marker.getLat());
						obj.put("lng", marker.getLng());
						ja.add(obj);
					}
			String ms = ja.toJSONString();
				out.write("data"+ms+"\n\n");		
				out.close();
	}

}
