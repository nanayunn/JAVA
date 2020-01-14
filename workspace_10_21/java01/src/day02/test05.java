package day02;

import java.io.FileInputStream;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("test05.txt"));
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("이름을 입력하세요.");
		
		while(true) {
		
		String name = scanner.nextLine();
		
		System.out.println("당신의 이름은"+" "+ name);
		
		//System.out.println("성적을 입력하세요_(국, 영, 수)");
		
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		scanner.nextLine();
		
		System.out.printf("국어: %d ,영어 : %d, 수학: %d,  %n", kor, eng, math) ;
		
		//System.out.println("주소를 입력하세요_");
		String address = scanner.nextLine();
		System.out.printf("당신의 주소는 %s %n ",address);
		
		if(scanner.hasNextLine() == false)
			break;
	}
		
		scanner.close();
		scanner = null;
		
		
	}

}
