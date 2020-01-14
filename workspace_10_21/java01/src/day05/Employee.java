package day05;

public class Employee {
	//class = 데이터+기능
	public String name;
	public String number;
	public int age;
	
	public void print() {
		System.out.printf("사원[이름 : %s, 사번 : %s] %n", name, number, age);
	}
	
	
}
