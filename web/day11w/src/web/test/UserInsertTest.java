package web.test;

import web.dao.PhoneDao;
import web.vo.PhoneVO;

public class UserInsertTest {

	public static void main(String[] args) {
		PhoneDao dao = new PhoneDao();
		PhoneVO user = 
		new PhoneVO("id02","°¶·°½Ãs2",5, 1450000,0.4);
		try {
			dao.insert(user);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}



