package util;

public class MyMath {
	//데이터+기능 포메이션
	//정렬 클래스(sort)
	;
	
	public static  void sort(int[] num) {
		
		for(int i = 0; i<num.length-1 ;i++) {
			
			
			int min = i;
			for(int j = i+1; j<num.length;j++) {
				if (num[min] > num[j]) {
					min = j;
					
					}
					

				
			}
			if(i !=min ) {
			swap(num, i, min);
				
			}
	}
		

}
	
	//두개의 정수를 넘겨받아서 큰값을 리턴하는 함수
	
	public static int MAX(int a, int b) {
		return(a<b? b : a);
	}
	
	public static int MIN(int a, int b) {
		return(a<b? a : b);
	}
	
	public static void swap(int [] num, int i, int min) {
		int temp = num[i];
		num[i] = num[min];
		num[min] = temp;
		
	}
	
	
	
	
}