package day08;

public class Test01 {

	public static void main(String[] args) {
		
		String msg = new String("hello Java");
		String msg2 = new String("hello Java~~~~~~~~~");
		String msg3 = new String("hello Java~~~~~~~~~");
		System.out.println(msg.toString());
		System.out.println(msg2.equals(msg3));
		System.out.println(msg2.equals(msg));
		
		System.out.println("=================================");
		
		Employee emp1 = new Employee("아몬드", 22);
		Employee emp2 = new Employee("킨더", 12);
		Employee emp3 = new Employee("아몬드", 22);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.equals(emp3));
		System.out.println(emp1.equals(emp3));
		
		Employee emp = null;
		System.out.println(emp instanceof Employee);
		 
		System.out.println("=================================");
		
		
	}

}


class Employee extends Object {
	
	String name; 
	int age;
 
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
}
	public String toString(){
		return "Employee["+name+", "+age+"]";
	}
 
	 public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Employee) ) return false;
			Employee t = (Employee)obj;
			
			if ((name.equals(t.name))&&(age == t.age)) {
			return true;
			
			}else {
				return false;
			}
	 }
		 
		 
		 
		 // 내 틀린 답..
	 //return (boolean)obj.equals(name)|(boolean)obj.equals(age);
	       
	    }



