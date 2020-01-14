package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new TreeSet<String>();
		set.add("마이구미미1");
		set.add("마이구미미1");
		set.add("마이구미미2");
		set.add("마이구미미3");
		set.add("마이구미미4");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.printf(it.next()+" ");
			
		}
		
	}

}
