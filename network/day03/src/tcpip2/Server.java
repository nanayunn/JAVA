package tcpip2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	int port = 9999;
	ServerSocket serverSocket;
	Socket socket;
	
	
	
	public Server() {}
	
	class Receiver extends Thread{
		InputStreamReader ir;
		BufferedReader br;
		
		public Receiver(Socket socket) throws Exception {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		}
	
		
		
		@Override
		public void run() {
		while(br != null) {
			String msg = "";
			try {
				while((msg = br.readLine())!= null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
			System.out.println(msg);
		}
		}
	}
	
	
	public void startServer()  
	throws Exception{
		System.out.println("Start Server");
		try {
			serverSocket = new ServerSocket(port);
			while(true){
				//1 . ServerSocket
				//2 . Socket, ready
				System.out.println("Server Ready");
//				socket = serverSocket.accept();
//				System.out.println("Connected..");
//				//3 . Make Stream(½º·¹µå·Î »©µµ µÊ)
//				ir = 
//				new InputStreamReader(
//						socket.getInputStream() );
//				br = 
//				new BufferedReader(ir);
//				String msg = "";
//				while((msg = br.readLine()) != null) {
//					System.out.println(msg);
//				}
				new Receiver(socket).start();
			}
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	
	public static void main(String[] args) {
		Server server = new Server();
		try {
			server.startServer();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}






