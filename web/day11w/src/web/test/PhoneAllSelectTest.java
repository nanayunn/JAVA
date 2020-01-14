package web.test;

import java.util.ArrayList;

import web.dao.PhoneDao;
import web.vo.PhoneVO;



public class PhoneAllSelectTest {

	public static void main(String[] args) {
		PhoneDao dao = new PhoneDao();
		ArrayList<PhoneVO> list = null;
		
		try {
			list = dao.get();
			for(PhoneVO vo:list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
