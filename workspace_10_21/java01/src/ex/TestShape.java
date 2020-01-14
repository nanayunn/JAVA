package ex;


public class TestShape {

	public static void main(String[] args) {
		
		Shape [] shape = new Shape[2];
		
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangle("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}


	}

}
	abstract class Shape{
		protected double area;
		private String name;
		public abstract void calculationArea();
		
		
		
	
		public double getArea() {
			return area;
		}




		public void setArea(double area) {
			this.area = area;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public Shape() {
			super();
		}




		public Shape(String name, double area) {
			super();
			this.area = area;
			this.name = name;
		}




		public void print() {
		}
	}

	class Circle extends Shape{
		private double radius;

		
		
		
		public Circle() {
			super();
		}


		public Circle(String name, double radius) {
			super.setName(name);
			this.radius = radius;
		}




		public double getRadius() {
			return radius;
		}




		public void setRadius(double radius) {
			this.radius = radius;
		}




		@Override
		public void calculationArea() {
			super.setArea(radius*radius*Math.PI);;
			
		}




		@Override
		public void print() {
			
			System.out.println(super.getName()+"의 면적은 "+ super.getArea());
		}

		
		
		
	}
	
	class Rectangle extends Shape{
		private double width;
		private double hight;
		@Override
		public void calculationArea() {
			super.setArea(hight*width);
			
		}
		
		
		public Rectangle() {
			super();
		}


		public Rectangle(String name, double width, double hight) {
			super.setName(name);
			this.width = width;
			this.hight = hight;
		}


		public double getWidth() {
			return width;
		}


		public void setWidth(double width) {
			this.width = width;
		}


		public double getHight() {
			return hight;
		}


		public void setHight(double hight) {
			this.hight = hight;
		}


		@Override
		public void print() {
			System.out.println(super.getName()+"의 면적은 "+ super.getArea());
		}
	
		
		
	}