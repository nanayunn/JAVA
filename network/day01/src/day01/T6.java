package day01;

import java.util.Scanner;



class Customer implements Cus{
	String name;
	
	public Customer(String name) {
		this.name = name;
		
	}
Thread rthread = new Thread() {
		
	public void run() {
		/*회원가입 진행 시간은
		 * 10초가 걸리며
		 * 회원가입 하는 도중에 이름이 계속 출력되며
		 * 10초 후에 완료가 출력된다.
		 * 단, Thread.sleep(1000);으로 작업*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name + "Register");
		}
	System.out.println("가입 완료");
	}
	};
Thread lthread = new Thread() {
		
	public void run() {
		/*회원가입 진행 시간은
		 * 10초가 걸리며
		 * 회원가입 하는 도중에 이름이 계속 출력되며
		 * 10초 후에 완료가 출력된다.
		 * 단, Thread.sleep(1000);으로 작업*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name+"login..");
		}
	System.out.println("로그인 완료");
	}
	};
Thread othread = new Thread() {
		
	public void run() {
		/*회원가입 진행 시간은
		 * 10초가 걸리며
		 * 회원가입 하는 도중에 이름이 계속 출력되며
		 * 10초 후에 완료가 출력된다.
		 * 단, Thread.sleep(1000);으로 작업*/
	for(int i =1;i<=10;i++) {	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(name+"logout..");
		}
	System.out.println("로그아웃 완료");
	}
	};

@Override
public void register() {
	System.out.println("Register...."+name);
	
}
@Override
public void login() {
	System.out.println(name+"님 환영합니다");
	
}
@Override
public void logout() {
	System.out.println("로그아웃합니다.");
	
}
}
public class T6 {

	public static void main(String[] args) {
//r, l, o, q
//r 할때 name 입력받아 진행
//l은 로그인, o는 로그아웃
//q는 서버 종료
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
//					System.out.println("회원가입 필요!!!!!");
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
