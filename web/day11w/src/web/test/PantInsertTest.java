package web.test;

import web.dao.PantsDao;
import web.vo.PantsVO;

public class PantInsertTest {

	public static void main(String[] args) {
		PantsDao dao = new PantsDao();
		PantsVO pants = 
		new PantsVO("05", "�ĸ����߸���", 5, 15000);
		try {
			dao.insert(pants);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}

	}

}
