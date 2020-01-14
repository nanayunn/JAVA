package day08;

public class Interface {

	public static void main(String[] args) {
		Shape circle = new Circle();
		System.out.println(circle.circleArea(3));

			Circle c = new Circle();
			c.draw();
			c.move();
			c.circleArea(2.0);
	}

}

interface MoveAndDreable extends Moveable, Drawable{};



interface Moveable{
	void move() ;
	
}

interface Drawable{
	void draw();
	
}


abstract class Shape{
	public abstract double circleArea(double r);
	
}

class Circle extends Shape implements MoveAndDreable{
	@Override
	public double circleArea(double r) {
		return (Math.PI*r*r);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("move 수행");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 그리기");
	}
}


//Interface Shape{
//	//final static int na = 0;
//	public abstract double circleArea(double r);
//}
//
//class Circle implements Shape{
//
//	public double circleArea(double r) {
//		return Math.PI*r*r;
//	}
//	
//	
//	
//}