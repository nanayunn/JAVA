package mini_project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

class drone extends Thread{
	String id;
	double lat;
	double lng;
	double height;
	
	
	public drone() {
		super();
	}


	public drone(String id, double lat, double lng, double height) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.height = height;
	}




	@Override
	public void run() {
		
		String urlstr = 
				"http://70.12.113.202/test/drone.jsp?id=id01";
				double lat = Math.floor(37+ (Math.random()*0.01));
				double lng = Math.floor(127+(Math.random()*0.01));
				double height = Math.floor(Math.random()*10);
				urlstr +="&lat="+lat+"&lng="+lng+"&height="+height;
				
				URL url = null;
				HttpURLConnection con = null;
				try {
					url = new URL(urlstr);
					con = (HttpURLConnection)url.openConnection();
					con.setReadTimeout(5000);
					con.setRequestMethod("POST");
					con.getInputStream();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					con.disconnect();
		}
				
		
	}

}

class car extends Thread{
	String id;
	String category;
	double lat;
	double lng;
	
	
	
	public car() {
		super();
	}



	public car(String id, String category, double lat, double lng) {
		super();
		this.id = id;
		this.category = category;
		this.lat = lat;
		this.lng = lng;
	}


	@Override
	public void run() {
		String urlstr = 
				"http://70.12.113.202/test/car.jsp?id=id01";
				double lat = Math.floor(37+ (Math.random()*0.01));
				double lng = Math.floor(127+(Math.random()*0.01));
				String category = "Genesis";
				urlstr +="&category="+category+"&lat="+lat+"&lng="+lng;
				
				URL url = null;
				HttpURLConnection con = null;
				try {
					url = new URL(urlstr);
					con = (HttpURLConnection)url.openConnection();
					con.setReadTimeout(5000);
					con.setRequestMethod("POST");
					con.getInputStream();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					con.disconnect();
		}
				
	}
	
}


class apt extends Thread{
	String id;
	String name;
	int level;
	
	
	
	public apt() {
		super();
	}



	public apt(String id, String name, int level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}

	
	@Override
	public void run() {
		String urlstr = 
				"http://70.12.113.202/test/apt.jsp?id=id01";
				int level = (int) (Math.random()*100);
				String name = "Xi";
				urlstr +="&name="+name+"&level="+level;
				
				URL url = null;
				HttpURLConnection con = null;
				try {
					url = new URL(urlstr);
					con = (HttpURLConnection)url.openConnection();
					con.setReadTimeout(5000);
					con.setRequestMethod("POST");
					con.getInputStream();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					con.disconnect();
		}
	
}
}

public class Workshop {
	
	
	public static void main(String[] arg) throws Exception {
		
		Thread t1 = new drone();
		Thread t2 = new car();
		Thread t3 = new apt();
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}
	
	
}
