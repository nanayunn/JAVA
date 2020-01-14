package day06;


/**
 * 
 * @author 나윤쓰
 * @since 2019.10.28
 */

public class account2 {
	
	private String number;
	private String name;
	private int money;

	
	//기본(default) 생성자 함수
	public account2() {
		//System.out.println("account() call....");
		this("0000-000-000000", "고객명", -10);//맨 위로 올려줘야 오류 안남
//		//또 다른 생성자 합수
//		
////		number = "0000-00-00";
////		name = "고객명";
////		setMoney(-10);
		
	}
	
	public account2(String number, String name, int money) {
		this.setNumber(number);
		this.setName(name);
		this.setMoney(money);
	}

	public void setNumber(String number) {
		
		this.number = number;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @param money 은행에 돈 얼마 있냐 너
	 * 
	 */
	public void setMoney(int money) {
		if (money <0) return;
		this.money = money;
	}
	
	public String getName() {
		return this.name;	
	}
	public String getNumber() {
		return this.number;
	}
	
	public int getMoney() {
		return this.money;
	}
	//입금
		public void input(int money) {
		
		this.money += money;
	}
	
	//출금
	public void output(int money) {
		
		this.money -= money;
		
	}
	
	
	public void print() {
		System.out.printf("[계좌번호 : %s, 예금주 : %s, 잔액 : %d ]%n", number, name, money);
	}
	
	
	

}
