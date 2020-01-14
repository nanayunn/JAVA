package day05;

public class Prob5 {

public static void main(String args[]) {
		
		
		System.out.println( Prob5.leftPad("SDS", 6, '#') );
		System.out.println( Prob5.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5.leftPad("SDS", 2, '&') ); 
	}
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		StringBuilder sb = new StringBuilder();
		if(str.length() < size) {
			for (int i = 0; i<size-str.length();i++) {
				
				
				
				sb.append(padChar);
			
			}
			//return sb.toString() + str;
			sb.append(str);
			return sb.toString();
		}
		else if (str.length() >= size) {
			return str;
		}
		
		
		
		
		return null;
	}
}  
