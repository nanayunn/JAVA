package web.vo;

public class PantsVO {

	String id;
	String name;
	int amount;
	int price;
	
	
	public PantsVO() {
		
	}
	
	public PantsVO(String id, String name, int amount, int price) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		
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

	@Override
	public String toString() {
		return "PantVO [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + "]";
	}
	

	
}
