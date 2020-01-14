package day07;

public class Test04 {

	public static void main(String[] args) {
		
		Animal d = new Dog("개과","시바견","인절미");
		fish f = new fish("열대어", "트로피칼" );
		
		
		call(f);
		call(d);
		
		//a.print();
		

		
		

	}
	
	public static void call(Animal d) {
		d.print();
	}
	
	public static void call(Dog d) {
		
		d.print();
		
	}	
	public static void call(fish d) {
	
		d.print();
	
	}	
//	
	
	
	

}
