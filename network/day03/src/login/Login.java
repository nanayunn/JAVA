package login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class LoginThread extends Thread{
	
	
	String id;
	String pwd;
	String result;
	
	public LoginThread() {
		
	}
	public LoginThread(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public void run() {
		String urlstr = "http://70.12.113.206/test/login.jsp";
		urlstr +="?id="+id+"&pwd="+pwd;
		URL url = null;
		HttpURLConnection con = null;
		//InputStream in = null;
		//InputStreamReader is = null;
		BufferedReader br = null;

		try {
			url = new URL(urlstr);
			con = (HttpURLConnection) url.openConnection();
			con.setReadTimeout(5000);
			con.setRequestMethod("POST");
			//in = con.getInputStream();
			//is = new InputStreamReader(in);
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				String temp;
				while((temp = br.readLine())!= null) {
					result = temp.trim();
					
				}
			}else {
				result = "1";
			}
		} catch (MalformedURLException e) {
			// URL을 분리할 때 나는 에러
			e.printStackTrace();
		} catch (IOException e) {
			//커넥션 에러
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

public class Login {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		LoginThread lt;
		while(true) {
			String id = sc.nextLine();
			if(id.equals("q")) {
				break;
			}
			String pwd = sc.nextLine();
			System.out.println(id + " "+pwd);
			lt = new LoginThread(id, pwd);
			lt.start();
			lt.join();
			String result = lt.getResult();
			System.out.println(result);
			if(result.equals("1")) {
				System.out.println("Login OK");
			}else
				System.out.println("Login FAIL");
			
		}
		System.out.println("end");
		sc.close();
	}

}
