package day06;

public class Card {

	String kind;
	int number;
	
	final static int W = 5;
	final static int H = 7;
	
	public void print() {
		//int cnt = 10;
		
		
	System.out.printf("[size : (%d x %d), %s, %d] %n", Card.W, Card.H, this.kind, this.number);
	}
	
	
}
