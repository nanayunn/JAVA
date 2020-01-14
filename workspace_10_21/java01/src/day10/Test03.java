package day10;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		Employee[] emp = {
			new Employee("배고파",22),	
			new Employee("오늘의",32),	
			new Employee("메뉴는",12),	
			new Employee("파스타",62),	
			new Employee("맛있겠다",72)
		};
		
		
		System.out.println(Arrays.toString(emp));
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
	}

}


class Employee implements Comparable<Employee>{
	String name;
	int age;
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
		//return age -o.age;
	}
	
	
	
}