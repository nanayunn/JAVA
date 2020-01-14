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
 * Servlet implementation class Kaka
 */
@WebServlet({ "/Kaka", "/kaka" })
public class KakaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			response.setCharacterEncoding("EUC-KR");
			response.setContentType("text/json; charset=EUC-KR");
			PrintWriter out = response.getWriter();
			out.write(ja.toJSONString());
			out.close();
//		var positions = [
//		     			{
//		     				title: '카카오', 
//		     				lat: 33.450705,
//		     				lng :126.570677
//		     			},
//		     			{
//		     				title: '생태연못', 
//		     				lat: 33.450936, 
//		     				lng: 126.569477
//		     			},
//		     			{
//		     				title: '텃밭', 
//		     				lat:33.450879, 
//		     				lng:126.569940
//		     			},
//		     			{
//		     				title: '근린공원',
//		     				lat: 33.451393, 
//		     				lng: 126.570738
//		     			}
//		     		];
//		
	}

}
