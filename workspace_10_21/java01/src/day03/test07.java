package day03;

import java.io.FileInputStream;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("test06.txt"));
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("이름을 입력하세요.");
		
		for (int i =0; i<4; i++) {
		System.out.println(" ===================================== " );
		String name = scanner.nextLine();
		
		System.out.println("당신의 이름은"+" "+ name);
		
		//System.out.println("성적을 입력하세요_(국, 영, 수)");
		
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		scanner.nextLine();
		
		int total = kor + eng + math;
		int avg = total/3;
		char grade ='F';
		
		
		switch(avg/10) {
			case 9:
				grade = 'A';
				break;
			
			case 8 :
				grade = 'B';
				break;
			
			case 7 :
				grade = 'C';
				break;
				
			case 6 :
				grade = 'D';
				break;
				
			default :
				grade = 'F';
		}
		
//		if(avg>=90 && avg<=100) {
//			grade = 'A';
//		}else if (avg>=80 && avg<90) {
//			grade = 'B';
//		}else if (avg>=70 && avg<80) {
//			grade = 'C';
//		}else if (avg>=60 && avg<70) {
//			grade = 'D';
//		}else {
//			grade ='F';
//		}
		
		
		System.out.printf("국어: %d ,영어 : %d, 수학: %d,  %n", kor, eng, math) ;
		
		//System.out.println("주소를 입력하세요_");
		String address = scanner.nextLine();
		System.out.printf("평균 : %d, 등급 : %c %n", avg, grade);
		
		
		
	}
		
		scanner.close();
		scanner = null;
		
		
	}

}
