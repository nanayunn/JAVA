package day03;

public class test02 {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		String p1 = "Hello";
		String p2 = "Hello";
		
		System.out.printf("new : %s == %s %b %n", s1, s2, s1==s2);
		System.out.printf("new : %s == %s %b %n", s1, s2, s1.equals(s2));
		
		
		System.out.printf("      %s == %s %b %n", p1, p2, p1==p2);
		System.out.printf("      %s == %s %b %n", p1, p2, p1.equals(p2));

		int n = 100;
		char c = 'A';
		return;
		
	}

}
