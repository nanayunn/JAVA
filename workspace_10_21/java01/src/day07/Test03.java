package day07;

public class Test03 {

	public static void main(String[] args) {
		
		Animal f = new fish("열대어", "트로피칼" );
		f.breath();
		if(f instanceof fish) ((fish)f).print();
		
		Animal[] animals = {
				new Dog("개과","포메라니안","두부"),
				new Dog("개과","허스키","쫑이"),
				new Dog("개과","시바견","인절미"),
				new fish("열대어", "트로피칼" ),
				new fish("열대어", "트로피칼" )
		};

		for(Animal data: animals) {
			data.print();
		}
		
		
//
//		for(Animal data :animals) {
//			if(data instanceof fish)
//				((fish)data).print();
//			if(data instanceof Dog)
//				((Dog)data).print();
//		}
//		
//		
//		for(Animal data  : animals) {
//			data.breath();
//		}
		

	}

}
