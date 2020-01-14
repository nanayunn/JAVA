package web.test;

import web.dao.PhoneDao;
import web.vo.PhoneVO;

public class PhoneUpdateTest {

	public static void main(String[] args) {
		PhoneDao dao = new PhoneDao();
		PhoneVO phone = 
				new PhoneVO("id02", "°¶·°½Ãs2", 5, 1450000, 27.0);
		try {
			dao.update(phone);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}

	}

}
