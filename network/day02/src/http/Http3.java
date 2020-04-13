package http;

import java.net.HttpURLConnection;
import java.net.URL;

public class Http3 {

		public static void main(String[] args) 
				throws Exception{
					String urlstr = 
					"http://70.12.113.202/test/car.jsp?";
					urlstr += "id=gohome&lat=127.89&lng=37.2";
					
					URL url = new URL(urlstr);
					HttpURLConnection con = 
				(HttpURLConnection)url.openConnection();
					con.setReadTimeout(5000);
					con.setRequestMethod("POST");
					con.getInputStream();
					con.disconnect();
				}

}
