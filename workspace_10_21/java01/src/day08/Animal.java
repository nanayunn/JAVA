package day08;

public abstract class Animal {

	String kind = "동물의 종류";
	
	public abstract void breath();
	
	public void print() {
		System.out.println("Animal : " + kind);
	}
	

}

class Dog extends Animal{
	String kind = "개의 종류";
	String name = "두부";
	@Override
	public void breath() {
		System.out.println("폐");
	}
	
}

class Fish extends Animal{
	String kind = "물고기의 종류";
	String name = "참치";
	
	@Override
	public void breath() {
		System.out.println("아가미");
		
	}
	
}