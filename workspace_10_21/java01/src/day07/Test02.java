package day07;

public class Test02 {

	public static void main(String[] args) {
		
		Dog[] d = {
				new Dog("개과","포메라니안","두부"),
				new Dog("개과","허스키","쫑이"),
				new Dog("개과","시바견","인절미")
		};
		//Dog d = new Dog("개과","포메라니안","두부");
		//d.print();
		for(Dog data : d) {
			data.print();
		}
		
		
		

	}

	
	
}
