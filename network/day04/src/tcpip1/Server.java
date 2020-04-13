package tcpip1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	int port;
	ServerSocket serverSocket;
	Socket socket;
	boolean aflag = true;
	
	public Server() {}
	public Server(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		System.out.println("Start Server");
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				Socket socket =null;
				while(aflag) {
					try {
						System.out.println("Server Ready..");
						socket = serverSocket.accept();
						//소켓이 만들어지면 바로 시작해버리긔
						new Receiver(socket).start();
						System.out.println(socket.getInetAddress());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(r).start();
	}
	
	class Receiver extends Thread{

		
		InputStream is;
		DataInputStream dis;
		Socket socket;
		
		public Receiver(Socket socket) throws IOException {
			this.socket = socket;
			is = socket.getInputStream();
			dis = new DataInputStream(is);
		}
		
		@Override
		public void run() {
			while(dis != null) {
				try {
					String msg = dis.readUTF();
					if(msg.equals("q")) {
						System.out.println(socket.getInetAddress()+ " : "+msg);
						System.out.println(socket.getInetAddress()+" : Exit..");
						
						break;
					}
					System.out.println(socket.getInetAddress()+ " : "+msg);
				} catch (IOException e) {
					System.out.println(socket.getInetAddress()+" : Exit..");
					e.printStackTrace();
					break;
				}
				
			}
			try {
					if(dis != null) {
					dis.close();
					}
					if(socket != null){
						socket.close();
					}
					} catch (Exception e) {
					
			}
		}
	}

	
	public static void main(String[] args) {
		Server server = null;
		try {
			server = new Server(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
