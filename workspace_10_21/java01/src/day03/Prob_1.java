package day03;

public class Prob_1 {
	public static void main(String[] args) {
/*
 아래는 변수 num의 값에따라  양수 음수  0을 출력하는  코드이다.
삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
힌트:   삼항 연산자를 두번 이용   
*/
	int num = -90;
	System.out.println(num > 0? "양수":(num == 0? "0":"음수"));
//답안 : 
//	int num = 0;
//	System.out.println("양수 음수 0 판별 후 출력");
//	System.out.printf("%d => ", num);
//	System.out.println(num>0? "양수" : (num ==0? "0": "음수"));
	
	
	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	char ch = 'P';
	char lowerCase = (ch>=80? 'p': ch);
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);
	}
}          
//답안 :
//	char ch = 'A';
//	char lowerCase = ((ch>= 'A'&& ch<='Z')? (char)(ch+32) : ch);
//	System.out.print("ch:"+ch);
//	System.out.println(" to lowerCase :"+lowerCase);
	
