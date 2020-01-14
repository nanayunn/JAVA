package day08;

public class Test02 {

	public static void main(String[] args) {
		Account a1 = new Account("2017-009", 300);
		System.out.println(a1);
		Account a2 = new Account("2017-009", 300);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		
		
		
	}

}


class Account{
	String number;
	int money;
	boolean used;
	
	
	
	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public Account(String number, int money) {
		super();
		this.number = number;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
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
	
	
	
	
	
	
	
}