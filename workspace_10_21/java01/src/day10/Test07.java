package day10;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		
		Student[] ss = {
				new Student("마이구미", "007", 45),
				new Student("솜사탕", "107", 25),
				new Student("양념치킨", "507", 95),
				new Student("삼겹살", "607", 65),
				new Student("킨더초콜렛", "207", 25),
				
		};
		
		//List<Student> list = new ArrayList<Student>();
		Set<Student> list = new TreeSet<Student>();
		list.add(new Student("찹쌀떡", "4407", 15));
		list.add(new Student("찹쌀떡", "4407", 15));
		list.add(new Student("마이구미", "007", 45));
		list.add(new Student("양념치킨", "507", 95));
		list.add(new Student("삼겹살", "607", 65));
		list.add(new Student("킨더초콜렛", "207", 25));
		
		
//		Collections.sort( list);
		
//		Iterator<Student> it = list.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
		
		//C U R D
		Student s1 = new Student("삭제데이터", "삭제야", 89);
		boolean flag = list.add(s1);
		if(flag) System.out.println(s1+"등록되었습니다.");
		else System.out.println(s1+"등록실패");
		
		//목록출력
		 System.out.println("===리스트 출력===");
		print(list);
		
		//삭제
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) 
		{
			if(it.next().equals(s1)) {
			it.remove();
			
			System.out.println("===데이터 삭제 내용===");
			System.out.println(s1+"데이터 삭제되었습니다.");
			}
		}
		System.out.println("===데이터 갱신 결과===");
		print(list);
		
		//검색
		System.out.println("===검색 결과===");
		it = list.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			if(st.avg > 50) {
				System.out.println(st);
			}
//			if(st.number.equals("000")) {
//				System.out.println(st);
//			}
		}
		
		
		
		
		
		
		
	}

	private static void print(List<Student> list) {
		Collections.sort( list);
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
		private static void print(Set<Student> list) {
		//	Collections.sort( list);
			Iterator<Student> it = list.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
			
		
		
		
	}
}


class Student implements Comparable<Student>{
	
	String name;
	String number;//w중복되지 않앗
	int avg;
	
		
		
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avg;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (avg != other.avg)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}


	public Student(String name, String number, int avg) {
		super();
		this.name = name;
		this.number = number;
		this.avg = avg;
	}


	@Override
	public String toString() {
		return "[이  름 =" + name + ", 학  번 =" + number + ", 평  균 =" + avg + "]";
	}
	

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	

	}
	