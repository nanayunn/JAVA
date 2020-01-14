package day05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class test01 {

	public static void main(String[] args) {
		//String N = JOptionPane.showInputDialog("배열의 크기 정수값 입력");
		
		//int[] num = new int[Integer.parseInt(N)];
		int[] num = new int[6];
		
		for(int i = 0;i <num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
			
					for (int b = 0; b<i;b++) {
						if( num[i]==num[b]) {
							 i -= 1;
							break;
						}
					}
				
		//오름차순 정렬
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i<num.length-1 ;i++) {
			int min = i;
			for(int j = i+1; j<num.length;j++) {
				if (num[min] > num[j]) {
					min = j;
					
					}
					

				
			}
			if(i !=min ) {
			int temp = num[i];
			num[i] = num[min];
			num[min] = temp;
				
			}
		
			
		}
		System.out.println(Arrays.toString(num));
	}

}
