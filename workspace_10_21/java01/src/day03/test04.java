package day03;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적처리를 진행할까요?");
		System.out.println("yes 입력 시 계속 진행 ~~~");
		String msg = scanner.nextLine();
		
		//if (!msg.equals("yes")) {
		if (!msg.equalsIgnoreCase("yes")) {
			if (scanner!= null) scanner.close();
			System.out.println("종료합니다.");
			return;
			
		}
		
		System.out.println("성적처리 진행합니다.");
		
		System.out.println("다음의 데이터를 입력해 주세요.");

		if (scanner!= null) scanner.close();
		System.out.println("종료합니다.");
		return;
		
		
	}
	

}
