package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test05 {

	public static void main(String[] args) {
		
		Object[] names = new Object[100];
		
//		List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		list.add("hello4");
		
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\n========================");
		
		for(String data :list) {
			System.out.println(data + " ");
		}
		System.out.println("\n========================");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String msg = it.next();
			if(msg.equals("hello3")) it.remove();
			//System.out.println(msg);
		}
		System.out.println("===================");
		it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
	}

}



