package day04;

import java.util.Arrays;

public class test03_int의배열 {

	public static void main(String[] args) {
		int[] num = {99, 55, 87};
		
		
//		==
//				int[] num = null;
//				num = new int{}
		
		
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));

		int[] temp = new int[num.length*2];
		//System.out.println(Arrays.toString(temp));
		System.arraycopy(num, 0, temp, 0, num.length);
		//System.out.println(Arrays.toString(temp));
		num = temp;
		System.out.println("num ==temp?" + (num == temp));
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(temp));
		System.out.println("==============================");
		
		int[] j = {6, 8, 2, 4, 3};
		int [] copyj = j.clone();
		System.out.println(j);
		System.out.println(copyj);
		System.out.println(Arrays.toString(j));
		
		Arrays.sort(j);
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(copyj));
	}

}
