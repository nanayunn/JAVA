package day03;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		System.out.println("START");
		int a = 100;
		int b = 99;
		
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a/(double)b);
		
		System.out.printf("%d %d %d %n", a, a++, a);
		System.out.printf("%d %d %d %n", b, ++b, b);
		
		
		System.out.println(b+=100);
		System.out.println(b);
		
		int i =4;
		
		
		/*System.out.println(i%2);
		
		i = i/2;
		System.out.println(i%2);
		
		i = i/2;
		System.out.println(i%2);*/
		
		
		char c1 = '0';
		char c2 = 'a';
		
		System.out.println(c1==c2);
		//c1이 숫자인지 문자인지!
		
		String msg =null;
		
		
		if ('0'<=c1 && c1<='9'){ 
			msg = "숫자";
		}else {
			msg = "문자";
			}
		System.out.println(msg);
		
		
		System.out.println("======================================");

	
		boolean f = '0'<=c1 && c1<='9';
		String res = f? "숫자":"문자";
		System.out.println(res);
		
		System.out.println(f? "숫자":"문자");
		
		String s1 = "";
		String s2 = "   ";
		Scanner sc = null;
		
		//Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("s1 = (%s) , s2 = (%s) %n ", s1.trim().length(), s2.trim().length() );
		
		
		//String name = sc.nextLine();
		
		
		if(sc !=null) sc.close();
		
		//if(sc != null) sc.close();
		
		
		System.out.println("END");
		return;
		
	}

}
