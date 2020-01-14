package day07;

public class Person {

	protected String name;
	protected int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.printf("이   름 : %s   나  이 : %d ", name, age);
		
	}
	
}

class Student extends Person {
	
	//private String name;
	//private int age;
	private int id;
	
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		this.id = id;
	}
	
//	public Student(String name, int age, int id) {
//	super(name, age);
//	this.id = id;
//}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		super.print();
		System.out.printf("학     번 : %d %n", id);
		//System.out.printf("이   름 : %s   나  이 : %d   학     번 : %d %n", name, age, id);
	}

	
}

class Teacher extends Person{
	//private String name;
	//private int age;
	private String subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		this.subject = subject;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.printf("담당과목 : %s %n", subject);
		
		//System.out.printf("이   름 : %s   나  이 : %d   담당과목 : %s %n", name, age, subject);
	}
	
}

class Employee extends Person{
	//private String name;
	//private int age;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		this.dept = dept;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		
		super.print();
		System.out.printf("부     서 : %s %n", dept);
		
		//System.out.printf("이   름 : %s   나  이 : %d   부     서 : %s %n", name, age, dept);
	}
	
	
}




