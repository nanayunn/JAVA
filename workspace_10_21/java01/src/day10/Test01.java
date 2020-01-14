package day10;

public class Test01 {

	public static void main(String[] args) {
		Employee1 emp = new Employee1("홍길동",23);
		System.out.println(emp.name.toString().charAt(0));
		Employee1<String> emp1 = new Employee1<String>("찹쌀떡",5);
			System.out.println(emp1.name.charAt(0));
	}

}


class Employee1<T>{
	T name;
	int age;
	
	
	
	public Employee1() {
		super();
	}
	public Employee1(T name, int age) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee1 other = (Employee1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}