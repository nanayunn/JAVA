package web.vo;

import java.util.Date;

public class CarVO {
	
	
	private int id;
	private String name;
	private int price;
	private double cc;
	private Date regdate;

		public CarVO() {
	}
		public CarVO(int id, String name, int price, double cc, Date regdate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.cc = cc;
		this.regdate = regdate;
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
		public double getCc() {
			return cc;
		}
		public void setCc(double cc) {
			this.cc = cc;
		}
		public Date getRegdate() {
			return regdate;
		}
		public void setRegdate(Date regdate) {
			this.regdate = regdate;
		}
		@Override
		public String toString() {
			return "CarVO [id=" + id + ", name=" + name + ", price=" + price + ", cc=" + cc + ", regdate=" + regdate
					+ "]";
		}
		
		
}