package web.vo;

public class PhoneVO {

	String id;
	String name;
	int amount;
	int price;
	double discount;
	
	
	
	public PhoneVO() {
	}



	public PhoneVO(String id, String name, int amount, int price, double discount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.discount = discount;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	@Override
	public String toString() {
		return "PhoneVO [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + ", discount="
				+ discount + "]";
	}
	
	
	
}
