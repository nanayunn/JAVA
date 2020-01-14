package day06;

import java.util.Arrays;

import util.MyMath;

public class test02 {

	public static void main(String[] args) {
		int[] num = {99, 44, 55, 88, 100};
		MyMath.sort(num);
		
		System.out.println(Arrays.toString(num));
		
	
		System.out.println(MyMath.MAX(99, 20));
		System.out.println(MyMath.MIN(99, 20));
		
	}

}
