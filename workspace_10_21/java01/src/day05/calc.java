package day05;

public class calc {
	
	
//	public static int add(int a, int b) {
//		 return a+b;
//	}
	
	public static int add(int ... a) {
		int sum = 0;
		for (int t:a) {
			sum += t;
		}
		return sum;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static int sub(int a, int b) {
		return a >= b? a-b: b-a;
	}
	public static int multi(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		
//		return b==0? b : a/b;
		return b==0? -1 : a/b;
	}


}
