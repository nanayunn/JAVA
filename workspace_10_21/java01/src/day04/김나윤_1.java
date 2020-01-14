package day04;

public class 김나윤_1 {

//		고전 암호학(Classical Cryptography)에서 사용하는 기법 중 
//		“Caesar Cipher” 는 
//		암호화의 대상이 되는 각각의 문자들을 알파벳 상의 
//		세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법
//		(즉, a는 d로, b는 e로, … , x는 a로, y는 b로, z는 c로)입니다.  
//		“everyday we have is one more than we deserve” 라는 문자열에 대해 
//		Caesar Cipher 를 적용하여 암호화된 문자열 값을 아래와 같이 출력하도록 
//		Prob3의 클래스의 main 함수를 완성하십시오. 
//		
	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		
		
		
		
		for (int j =0; j<sourceString.length(); j++) {
			if(sourceString.charAt(j) == ' ')
				encodedString += (char) (sourceString.charAt(j));
			else if(sourceString.charAt(j)>=97&&sourceString.charAt(j)<=119)
					encodedString += (char) (sourceString.charAt(j)+3);
				else if(sourceString.charAt(j)>119)
					encodedString += (char) (sourceString.charAt(j)-23);
			
			
			
			 
			
			
		}
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
			
			
		}
}

		// 프로그램 구현부 끝.
		
//		System.out.println("암호화할 문자열 : " + sourceString);
//		System.out.println("암호화된 문자열 : " + encodedString);
		
		
		
		
		
		
		



