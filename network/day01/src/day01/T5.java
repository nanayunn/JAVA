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
		

		System.out.println(name);
		}
	System.out.println("�Ϸ�");
	}
}

public class T5 {

	public static void main(String[] args) {
		/*���� ������ ��������
		 * �׻� ����ڰ� ��û�� �� �� �ִ�.
		 * ������� ��û�� �̸��� �Է��ϸ�
		 * ȸ�������� ���� �˴ϴ�.*/
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
