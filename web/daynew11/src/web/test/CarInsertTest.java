package web.test;

import web.dao.CarDao;
import web.vo.CarVO;

public class CarInsertTest {

	public static void main(String[] args) {
		CarDao dao = new CarDao();
		CarVO car = new CarVO(0, "k3", 3000, 300.0,null);
		
		try {
			dao.insert(car);
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("fail");
		}

	}

}
