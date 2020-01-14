package day02;

public class test02 {

	public static void main(String[] args) {
		
		/*
		boolean char 
		정수 int(byte short int long) 
		실수 double(float double)
		문자열
		*/
		
		char c = 'B';
		String s = "Hello Java~ ";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		//System.out.printf("%c = %d  %n", c, (int)c);
		
		System.out.println((char)65);
		
		char c2 = 'd';
		System.out.printf("%c => %c %n", c2, c2-32);
		
		String ssn = "900909-2345678";//주민번호
		boolean flag = ssn.length() == 14;
		System.out.printf("%s=> %b %n", ssn, flag);
		
		//c2 값이 소문자인지 체크
		System.out.printf("a = %d, z = %d %n", (int)'a', (int)'z');
		flag = c>=97&& c<=122;
		//flag = c>='a' && c<='z';
		System.out.printf("%c 소문자? %b %n", c, flag);
		
		
		c = '9'; //char c
		flag = Character.isDigit(c);
		System.out.printf("%c 숫자니? %b %n", c, flag);
		
		
		//		System.out.println('A');
//		System.out.println((int)'A');
//		System.out.println((int)'a');
		// ctrl+f, ctrl+alt+화살표, ctrl+d, ctrl+s
		
		
		System.out.printf("%c = %d  %n", c, (int)c);
		System.out.printf("%c = %d  %n", c++, (int)c++);
	}

}
