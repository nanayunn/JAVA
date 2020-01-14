package day07;

public class Test01 {

	public static void main(String[] args) {
		//Is a 관계 : 모든 객체의 Data Type의 부모가 될 수 있다. 
		//Object 자바에서 최상위 객체이다. 
		
		Object a = new Animal();
		if (a instanceof Animal)
		((Animal)a).breath();
		 Animal aa = (Animal) a;
		 aa.breath();
		 
		 Object obj = new String("Hello Java");
		 if (obj instanceof String)((String)obj).toLowerCase();
		 
		 Object obj2 = new Dog();
		 if (obj2 instanceof String)((String)obj2).toLowerCase();
		 
		 Animal a2 =new Dog();
		// Dog d = new Animal();
		 
		 
		
	}
//		Animal a = new Animal();
//		//a.breath();
//		
//
//		Dog d = new Dog();
//		d.breath();
//		System.out.println(d.kind);
//		System.out.println(((Animal)d).kind);
//		System.out.println(d.name);
//		d.print();
//	}
//
}
