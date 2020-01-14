package web.test;

import web.dao.PantsDao;
import web.vo.PantsVO;

public class PantsDeleteTest {

	public static void main(String[] args) {
		PantsDao dao = new PantsDao();
		PantsVO pants = 
				new PantsVO("05","",0,0);
		try {
			dao.delete("05");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}

	}

}
