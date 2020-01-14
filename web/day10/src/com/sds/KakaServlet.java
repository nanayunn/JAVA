package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class Kaka
 */
@WebServlet({ "/Kaka", "/kaka" })
public class KakaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/event-stream;charset=utf-8");
		PrintWriter out = response.getWriter();
		ArrayList<marker> list = new ArrayList<>();
		 DecimalFormat form = new DecimalFormat("#.######");


		Double lat1= 37 + Math.random();
		Double lat2= 37 + Math.random();
		Double lat3= 37 + Math.random();
		Double lng1= 127 + Math.random();
		Double lng2= 127 + Math.random();
		Double lng3= 127 + Math.random();
		
		
		list.add(new marker("하나", Double.parseDouble(form.format(lat1)), Double.parseDouble(form.format(lng1))));
		list.add(new marker("하나", Double.parseDouble(form.format(lat2)), Double.parseDouble(form.format(lng2))));
		list.add(new marker("하나", Double.parseDouble(form.format(lat3)), Double.parseDouble(form.format(lng3))));

	
			JSONArray ja = new JSONArray();
			for(marker marker:list) {
				JSONObject obj = new JSONObject();
				obj.put("title", marker.getTitle());
				obj.put("lat", marker.getLat());
				obj.put("lng", marker.getLng());
				ja.add(obj);
			}
//			response.setCharacterEncoding("EUC-KR");
//			response.setContentType("text/json; charset=EUC-KR");
			String ms = ja.toJSONString();
			out.write("data:" + ms + "\n\n");
			out.close();
	
	}

}
