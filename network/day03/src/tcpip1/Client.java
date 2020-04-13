package tcpip1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


class Sender{

	public Sender(Socket socket) {
		// TODO Auto-generated constructor stub
	}
	
}

public class Client {

	int port = 9999;
	String ip = "70.12.231.175";
	 
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
		try {
			osw = new OutputStreamWriter(
					   socket.getOutputStream()
					);
			bw = new BufferedWriter(osw);
			while(true) {
				bw.write("ÇÑ³ª");
				Scanner sc = new Scanner(System.in);
				String msg = sc.nextLine();
				Sender sender = new Sender(socket);
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				bw.close();
			}
			if(socket != null) {
				socket.close();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect();
			//client.request();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End Client");
	}

}





