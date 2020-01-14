package web.test;

import web.dao.PhoneDao;
import web.vo.PhoneVO;

public class PhoneDeleteTest {

	public static void main(String[] args) {
		PhoneDao dao = new PhoneDao();
		PhoneVO phone = 
				new PhoneVO("05","",0,0,0.0);
		try {
			dao.delete("id01");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}

	}

}
