package day09;

import java.io.Serializable;

public class Test10 {

	public static void main(String[] args) {
		Account a = null;
		try {
			a = new Account("2019-001",90);
		} catch (NegativeMoneyException e1) {
			
			System.out.println(e1.getMessage());
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
		try {
			if(a!=null)a.setMoney(1800);
		} catch (NegativeMoneyException e) {
			//
			e.printStackTrace();
		}
		System.out.println(a);
	}

}

class Account extends Object implements Serializable{
	String number;
	int money;
	
	
	public Account() {
		super();
	}
	
	public Account(String number, int money)throws NegativeMoneyException {
		super();
		this.number = number;
		this.money = money;		
		try {
			setMoney(money);
		} catch (NegativeMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) throws NegativeMoneyException{
		if(money<0) throw new NegativeMoneyException();
		this.money  = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}

}


class NegativeMoneyException extends Exception{
	NegativeMoneyException(){
		super("잔고가 마이너스는 안돼유");
	}
	NegativeMoneyException(String msg){
		super(msg);
	}
	
	
}












