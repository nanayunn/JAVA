package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test08 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//id   password
			
		
		map.put("today", "4160");
		map.put("Friday", "6824");
		map.put("Opic", "99954");
		map.put("NOjam", "657468");
		map.put("banapresso", "654654");
		map.put("happynewyear", "55454");
		
		//System.out.println(map.get("NOjam"));
		
		Set<String> keys = map.keySet();
		//System.out.println(keys);
		 Iterator<String> it = keys.iterator();
		 while (it.hasNext()) {
			 String id = it.next();
			System.out.println(id + ":" + map.get(id)); 
			
		}
		//로그인 처리 합싀다ㅏㅏㅏ
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
			 System.out.println("ID/PW 입력하세용");
			 System.out.println("ID_" );
			 String id = scanner.nextLine().trim();
			 System.out.println("PW_" );
			 String pw = scanner.nextLine().trim();
			 
			 if(!map.containsKey(id)) {
				 System.out.println("회원가입부터 하고오시죠!");
				 continue;
			 }else {
				 if(map.get(id).equals(pw)) {
					 System.out.println("로그인 성공쓰");
					 break;
				 }else {
					 System.out.println("ID PW 잘못 쓰신듯....");
				 }
			 }
			 
			 
			 
			 
			 
		 }
		 
		 System.out.println("서비스 이용가능하심다~^^");
		
	}

}
