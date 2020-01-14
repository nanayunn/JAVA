package day06;

public class test04 {

	public static void main(String[] args) {
		System.out.println(Card.W + ", "+Card.H);

		Card c1 = new Card();
		c1.kind = "다이아몬드";
		c1.number = 2;
		c1.print();
		 
		Card c2 = new Card();
		c2.kind = "다이아몬드";
		c2.number = 1;
		c2.print();
		
		Card c3 = new Card();
		c3.kind = "다이아몬드";
		c3.number = 5;
		c3.print();
		
		
	}

}
