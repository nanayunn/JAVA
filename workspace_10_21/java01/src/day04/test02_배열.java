package day04;

import java.util.Arrays;

public class test02_배열 {

	public static void main(String[] args) {
		int[] ko = null;
		ko = new int[5];
		
		for(int i = 0;i <ko.length; i++) {
			ko[i] = (int)(Math.random()*100)+1;
		}
			 
		for(int i = 0;i <ko.length; i++) {
			System.out.print(ko[i]+" ,");
		}
		System.out.println();
		
		for(int avg : ko) {
			char grade = 'F';
		
			
//			if(avg>=90 && avg<=100) {
//				grade = 'A';
//			}else if (avg>=80 && avg<90) {
//				grade = 'B';
//			}else if (avg>=70 && avg<80) {
//				grade = 'C';
//			}else if (avg>=60 && avg<70) {
//				grade = 'D';
//			}else {
//				grade ='F';
//			}
			
			System.out.print(avg+""+ grade + " ");
			
			
		}
		System.out.println();
		System.out.println(ko);
		System.out.println(Arrays.toString(ko));
		Arrays.sort(ko);
		System.out.println(Arrays.toString(ko));
		
//		System.out.print(ko[0]);
//		System.out.print(ko[1]);
//		System.out.print(ko[2]);
//		System.out.print(ko[3]);
//		System.out.print(ko[4]);

	}

}
