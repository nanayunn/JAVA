package day08;

public class Test03 {

	public static void main(String[] args) {
		Animal[] a = {
				new Dog(),
				new Fish(),
		};
		for(Animal data : a) {
			data.breath();
		}

	}

}
