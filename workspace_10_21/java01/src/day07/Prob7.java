package day07;

public class Prob7 {

	public static void main(String[] args) {
		Person[] people = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과"),
				
		};
		
		for(Person data: people) {
			data.print();
		}
		
	}

}
