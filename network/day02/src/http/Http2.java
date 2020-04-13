package http;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Http2 {

	public static void main(String[] args) throws Exception {
		String urlstr = "http://70.12.113.206/test/tomcat.zip";
		URL url = new URL(urlstr);
		URLConnection con = url.openConnection();
		
		InputStream is = null;
		BufferedInputStream bis = null;
		is = con.getInputStream();
		bis = new BufferedInputStream(is,1000000);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		fos = new FileOutputStream("tomcat.zip");
		bos = new BufferedOutputStream(fos);
		
		int data = 0;
		while((data = bis.read()) != -1){
			System.out.println(data);
		}
		bis.close();
		bos.close();
		System.out.println("end..");
	}
	

}
