package day06;

public class Book_2 {
	private String title;
	private int price;
	
	public Book_2() {
		this("",0);
	}
	
	
	
	public Book_2(String title, int price) {

		this.title = title;
		this.price = price;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
