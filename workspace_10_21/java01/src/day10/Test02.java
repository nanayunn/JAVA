package day10;

public class Test02 {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2();
		Employee2<String,Double> emp2 = new Employee2<String, Double>("홍길동",23.0);
		Employee2<String,Integer> emp3 = new Employee2<String, Integer>("홍길동",23);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
	}

}


class Employee2<T,P extends Number>{
	T name;
	P age;
	
	
	
	public Employee2() {
		super();
	}

	public Employee2(T name, P age) {
		super();
		this.name = name;
		this.age = age;
		
		
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public P getAge() {
		return age;
	}

	public void setAge(P age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
