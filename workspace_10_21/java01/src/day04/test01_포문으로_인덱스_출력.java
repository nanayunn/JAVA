package day04;

public class test01_포문으로_인덱스_출력 {

	public static void main(String[] args) {
		
		String msg = "Happy New Year";
		System.out.println(msg);
		
		for(int i = 0;i< msg.length();i++) {
			
			char ch = msg.charAt(i);
			char r = (ch>= 'A'&& ch<='Z')? (char)(ch+32) : ch;
			System.out.print(r);
//			System.out.println(msg.charAt(msg.length()-1));
		}

		
		
	}

}
