package com.sds;

public class macaron {
	int id;
	String name;
	int price;
	int stock;
	String img;
	public macaron(int id, String name, int price, int stock, String img) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "macaron [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", img=" + img + "]";
	}
	
}
