package day06;

import javax.swing.JOptionPane;

public class account_test {

	public static void main(String[] args) {
		//account a = new account();
		
		account a1 = new account("1002-632-783252","김나윤",200000000);
//		a1.setNumber("1002-632-783252");
//		a1.setName("김나윤");
//		a1.setMoney(200000000);
		

		account a2 = new account("1002-760-485362","김김김",20);
//		a2.setNumber();
//		a2.setName("김김김");
//		a2.setMoney(20);
		
		//a.print();
		a1.print();
		a2.print();
		
		account[] accounts = {
				new account("1002-632-783252","김나윤",200000000),
				new account("1002-760-485362","김김김",20),
				new account("1002-346-278458","김dd",200),
				new account("1002-686-358565","sss",200000),
				new account("1002-345-965846","ddd",2)
		};
		
		
		String snum = JOptionPane.showInputDialog("검색할 계좌번호를 입력하세요");
		
		System.out.println("계좌 검색 " + snum);
		for(int i = 0;i<accounts.length;i++) {
			
			if(accounts[i].getNumber().equals(snum)) {
			
				accounts[i].print();
			}
		}
	}

}
