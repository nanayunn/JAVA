package day07;

public class Animal extends Object {

	protected String kind = "동물의 종류";
	 
	
	
	public Animal() {
		super();
	}



	public Animal(String kind) {
		super(); //object의 기본 생성자 호출
		this.kind = kind;
	}



	public void breath() {
		System.out.println(kind + " 폐로 숨쉰다");
	}
	
	public void print() {
		
	}
}

class Dog extends Animal{
	String kind = "강아지의 종류";
	String name;
	
	
	
	public Dog() {
		super();
	}


	public Dog(String kind, String kind2, String name) {
		super(kind);
		//super.kind = kind;
		this.kind = kind2;
		this.name = name;
	}


	public void print() {
		System.out.printf(" Dog[%s, %s, %s] %n", super.kind, this.kind, name);
	}
	
}

class fish extends Animal{
	String kind;
	String name;
	
	
public fish(String kind, String name) {
		super("물고기과");
		this.kind = kind;
		this.name = name;
	}



public void print() {
	System.out.printf(" fish[%s, %s, %s] %n", super.kind, this.kind, name);
}

 	@Override
public void breath() {
	System.out.println(kind + " 아가미로 숨쉰다");
}

}







