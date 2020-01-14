package day03;

public class test05 {

	public static void main(String[] args) {
		
		int i;
		for( i = 0 ; i<=10 ; i++ ) {
		System.out.println(i + "Hello Java");
		//System.out.println(i);
		
		}
		
		System.out.println(i);
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int a = 0; a<=100; a ++) {
			sum += a; //sum = sum +a
			if(a%2 == 0) sum2 += a;
		}
		
		System.out.println("1~100 합 " + sum);
		System.out.println("1~100 짝수 합 "+ sum2);
		System.out.println("===============================");
		
		System.out.println();
		
		for(int b =1; b<3; b ++) {
			for (int j =7; j<10; j++) {
				System.out.printf("[%d, %d]", b, j);
			}
			System.out.println();
		}
		System.out.println("===============================");
		
		
		int w = 0;
		boolean flag = false;
		
		while(w < 10) {
			System.out.println(w +" ** while ** ");
			if (w++==10) flag =! flag;
			
		}
		System.out.println("===============================");
		
		flag = false;
		 do {
			
			 System.out.println(" ** do  while ** ");
		 }  while(flag);
		}
	}
	