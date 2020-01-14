package day04;

public class 과제풀이 {
	public static void main(String[] args) {
		
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				StringBuffer sb = new StringBuffer();
				
				
				//StringBuilder sb = new StringBuilder();
				
		
				for (int j =0; j<sourceString.length(); j++) {
					char c = sourceString.charAt(j);
					char r = c>='a' && c<='w'? (char) (c+3):
						c>='x' && c<='z'? (char)(c-23):c;
					//encodedString += r;
					sb.append(r);
						
				}
				
				encodedString = sb.toString();
				
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
	}
}
