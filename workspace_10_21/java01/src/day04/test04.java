package day04;

import java.util.Arrays;
//import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
//		char[] c = new char[3];
//		boolean[] flag =  new boolean[3];
//		Scanner[] scanners = new Scanner[2];
//		String[] names = new String[3];
		
		//char[] chars = {'A', ' ', 'B', '1', 'c'};
		//System.out.println(Arrays.toString(chars));
		String msg = "집가고싶다.";
		char[] chars = new char[msg.length()];
		for (int i = 0; i<msg.length(); i ++) {
			chars[i] = msg.charAt(i);
			
		}
		char[] charmsg = msg.toCharArray();
	
		System.out.println(msg);
		System.out.println(Arrays.toString(charmsg));
		
		
		//char[] cc = {'a', 'b', 'c', 'd'};

//		String ccs = new String(cc);
//		System.out.println(cc);
		
		String[] names = {"홍길돟", "돌돌이", "김이박김","수리수리"};
		for (String data : names) {
			System.out.println(data.charAt(0)+ "**");
		}
		//전통적인 for문 방식
//		for(int i =0; i< names.length; i ++)
//			System.out.println(names[i].charAt(0)+"**");
		
	}

	
}
