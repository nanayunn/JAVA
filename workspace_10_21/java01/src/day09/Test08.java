package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08 {

	public static void main(String[] args) {
		
		System.out.println("start");

		Scanner scanner =null;
		StringTokenizer st = null;
		try {
			 scanner = new Scanner(new File("c://lib//data"));
				
		while(scanner.hasNextLine()){
			
//			String[] data = scanner.nextLine().split(" ");
//			System.out.println(data[0]);
//			st = new StringTokenizer(scanner.nextLine());
//			System.out.println(st.nextToken());
			
			String url = scanner.nextLine();
			System.out.println(url);
			int idx = url.lastIndexOf("/");
			System.out.println(url.substring(idx));
			
			
		}
		
		} catch (FileNotFoundException e) {       
			
			e.printStackTrace();
		}
//		finally {
//			if(scanner!=null) scanner.close();
//		}
		
		
		System.out.println("end");

	}

}
