package day01;

import java.util.Scanner;



class Customer implements Cus{
	String name;
	
	public Customer(String name) {
		this.name = name;
		
	}
Thread rthread = new Thread() {
		
	public void run() {
		/*ȸ������ ���� �ð���
		 * 10�ʰ� �ɸ���
		 * ȸ������ �ϴ� ���߿� �̸��� ��� ��µǸ�
		 * 10�� �Ŀ� �Ϸᰡ ��µȴ�.
		 * ��, Thread.sleep(1000);���� �۾�*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name + "Register");
		}
	System.out.println("���� �Ϸ�");
	}
	};
Thread lthread = new Thread() {
		
	public void run() {
		/*ȸ������ ���� �ð���
		 * 10�ʰ� �ɸ���
		 * ȸ������ �ϴ� ���߿� �̸��� ��� ��µǸ�
		 * 10�� �Ŀ� �Ϸᰡ ��µȴ�.
		 * ��, Thread.sleep(1000);���� �۾�*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name+"login..");
		}
	System.out.println("�α��� �Ϸ�");
	}
	};
Thread othread = new Thread() {
		
	public void run() {
		/*ȸ������ ���� �ð���
		 * 10�ʰ� �ɸ���
		 * ȸ������ �ϴ� ���߿� �̸��� ��� ��µǸ�
		 * 10�� �Ŀ� �Ϸᰡ ��µȴ�.
		 * ��, Thread.sleep(1000);���� �۾�*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name+"logout..");
		}
	System.out.println("�α׾ƿ� �Ϸ�");
	}
	};

@Override
public void register() {
	System.out.println("Register...."+name);
	
}
@Override
public void login() {
	System.out.println(name+"�� ȯ���մϴ�");
	
}
@Override
public void logout() {
	System.out.println("�α׾ƿ��մϴ�.");
	
}
}
public class T6 {

	public static void main(String[] args) {
//r, l, o, q
//r �Ҷ� name �Է¹޾� ����
//l�� �α���, o�� �α׾ƿ�
//q�� ���� ����
//		Scanner sc = new Scanner(System.in);
//		String input;
//		
//		ArrayList<String> list = new ArrayList<String>();
//		input= sc.nextLine();
//		
//		if(input =="r") {
//			String name = sc.nextLine();
//			Customer t1 = new Customer(name);
//			t1.rthread.run();
//			list.add(name);
//			//System.out.println("Registerd.."+name);
//		}else if(input == "l"){
//			for(int i = 0;i<=list.size();i++) {
//				String name = sc.nextLine();
//				if(list.contains(name)) {
//					Customer t2 = new Customer(name);
//					t2.lthread.run();
//				}else {
//					System.out.println("ȸ������ �ʿ�!!!!!");
//				}
//			}
//		}else if(input == "o") {
//			String name = sc.nextLine();
//			Customer t3 = new Customer(name);
//			t3.rthread.run();
//
//			
//		}else if(input == "q") {
//			sc.close();
//		}
	
	Cus c = null;
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("Input cmd..");
		String cmd = sc.nextLine();
		if(cmd.equals("r")) {
			
		}else if(cmd.equals("l")) {
			
		}else if(cmd.equals("o")) {
			
		}else if(cmd.equals("q")) {
			break;
		}
	}
	sc.close();
	c = new Customer("kim");
	c.register();
	c.login();
	c.logout();
		
		
		
	}

}
