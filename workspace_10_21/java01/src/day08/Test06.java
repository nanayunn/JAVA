package day08;

public class Test06 {

	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();

	}

}


class A{
	String name = "AAAAAAA";
	class B{

	public void print() {
		System.out.println(name);
	}}


}
