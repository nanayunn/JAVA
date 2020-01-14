package day05;

public class test02 {

	public static void main(String[] args) {
		
//		Employee emp = null;
//		emp = new Employee();
		
		Employee emp1 = new Employee();
		emp1.name = "홍길동";
		emp1.number = "2017-001";
		emp1.age = 31;
		
		
		Employee emp2 = new Employee();
		emp2.name = "고길동";
		emp2.number = "2019-007";
		emp2.age = 28;
		
		
		
		Employee emp3 = emp1;
		Employee emp4 = emp2;
		
//		System.out.println(emp1.name);
//		System.out.println(emp2.age);
//		System.out.println(emp3.number);
//		System.out.println(emp4.name);
		
//		System.out.printf("사원 이름 : %s, 사원 번호 : %d %n", emp1.name, emp1.number);
		
		emp1.print();
		emp2.print();
	
		
		
	}

}
