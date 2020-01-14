package web.test;

import java.util.ArrayList;

import web.dao.CarDao;
import web.vo.CarVO;

public class CarSelectTest {

	public static void main(String[] args) {
		CarDao dao = new CarDao();
		ArrayList<CarVO> list = null;
		try {
			list = dao.get();
			for(CarVO vo :list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("fail");
		}

	}

}
