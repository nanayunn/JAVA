package web.test;

import java.util.ArrayList;

import web.dao.PantsDao;
import web.vo.PantsVO;



public class PantsAllSelectTest {

	public static void main(String[] args) {
		PantsDao dao = new PantsDao();
		ArrayList<PantsVO> list = null;
		
		try {
			list = dao.get();
			for(PantsVO vo:list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
