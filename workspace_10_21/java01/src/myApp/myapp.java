package myApp;

import java.util.Scanner;

public class myapp {

	public static void main(String[] args) {
		
		
		// 메뉴 구성
		// 입력 Input
//		 수정 update
//		 삭제 delete
//		 검색, 목록보기 select
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
		System.out.println("**************************************");
		System.out.println("**********   Food Aplication   *******");
		System.out.println("**************************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 ..");
		System.out.println("1. 파스타");
		System.out.println("2. 김치찌개");
		System.out.println("3. 찹쌀떡");
		System.out.println("4. 초코칩쿠키");
		System.out.println("5. 솜사탕");
		System.out.println("6. 종료");
		System.out.println("**************************************");
		
		String a = scanner.nextLine().trim();

//		System.out.println(a);
		
		switch(a) {
		case "1" :
			System.out.println("1. 파스타");
			break;
		case "2" :
			System.out.println("2. 김치찌개");
			break;
		case "3" :
			System.out.println("3. 찹쌀떡");
			break;
		case "4" :
			System.out.println("4. 초코칩쿠키");
			break;
		case "5" :
			System.out.println("5. 솜사탕");
			break;
		case "6" :
			System.out.println("정말 종료하시겠습니까?(예/아니요)");
			String i = scanner.nextLine().trim();
			if (i.equals("예")) {
				scanner.close();
			return;}
			else if(i.equals("아니요")){
				break;
			}
			
			
			
			
		default:
			System.out.println("유효하지 않은 번호입니다. 다시 입력해주십시오.");
			break;
		
		}
		
		
		}
			}
		
	}

		
		
	


