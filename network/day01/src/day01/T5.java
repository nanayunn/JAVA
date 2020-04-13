package day01;

import java.util.ArrayList;
import java.util.Scanner;

class Register extends Thread{
	String name;
	
	public Register() {
		super();
	}

	public Register(String name) {
		super();
		this.name = name;
	}

	@Override
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
		

		System.out.println(name);
		}
	System.out.println("완료");
	}
}

public class T5 {

	public static void main(String[] args) {
		/*무한 루프를 동장으로
		 * 항상 사용자가 요청을 할 수 있다.
		 * 사용자의 요청은 이름을 입력하면
		 * 회원가입이 진행 됩니다.*/
		//ArrayList<String> nlist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String input; 
		while(true) {
			input =  sc.nextLine();
			if(input.equals("q")) {
				break;
			}
			Thread t1 = new Register(input);
			t1.start();
		}
		sc.close();
	}

}
