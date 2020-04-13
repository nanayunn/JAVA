package tcpip2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;




class DownThread implements Runnable{

	
	String fname;
	String status;
	
	public DownThread() {
		
	}
	
	public DownThread(String fname) {
		this.fname = fname;
	}
	
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void run() {
		String urlstr = "http://70.12.113.206/test/file/";
		urlstr += fname+".jar";
		URL url=null;
		//InputStream is = null;
		BufferedInputStream bis = null;
		//FileOutputStream fos = null;
		BufferedOutputStream bos = null;		
		try {
			url = new URL(urlstr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			//is = con.getInputStream();
			bis = new BufferedInputStream(url.openStream());
			//fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(new FileOutputStream(fname));
			int data = 0;			
			while((data = bis.read()) != -1){
				System.out.println(data);
				bos.write(data);
			}
			status = "end...";
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
	try {
			bis.close();
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		}
		
	}
	
}


class GetThread extends Thread{
	
	String fname;
	
	public GetThread(String fname) {
	this.fname = fname;
	}
	
	
	@Override
	public void run() {
		DownThread dt = null;
		dt = new DownThread(fname);
		Thread t = new Thread(dt);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End...");
	}
}


public class Client {

	int port = 9999;
	String ip = "70.12.113.206";
	 
	Socket socket;
	
	OutputStreamWriter osw;
	BufferedWriter bw;

	public Client() {}
	public void connect() throws InterruptedException{
		try {
			socket = new Socket(ip, port);
			System.out.println("Connected...");
		}catch(Exception e) {
			while(true) {
				Thread.sleep(2000);
				try {
					socket = new Socket(ip, port);
					System.out.println("Connected...");
					break;
				}catch(Exception e2) {
					System.out.println("Reconnected...");
				}
			}
		}
	}
	public void request() throws IOException {
		Scanner sc = new Scanner(System.in);
		DownThread dt;
		System.out.println("Input file name..");
		while(true) {
			String fname = sc.nextLine();
			if(fname.equals("q")) {
				break;
			}
			
			new GetThread(fname).start();
		}sc.close();
	}
	
	
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect();
			client.request();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End Client");
	}

}





