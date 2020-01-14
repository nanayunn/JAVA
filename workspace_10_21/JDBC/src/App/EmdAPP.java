package App;

import java.util.List;

import DAO.DeptDAO;
import VO.DeptVO;
import service.DeptService;
import serviceimpl.DeptServiceImpl;

public class EmdAPP {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		//객체 조립
		DeptService service = new DeptServiceImpl(dao);
		//service.getDeptAll().forEach(action);
		
//		System.out.println("---목록 LIST---");
//		for(DeptVO data : service.getDeptAll()) {
//			System.out.println(data);
//		}

		System.out.println("---목록 LIST---");
		List<DeptVO> list = service.getDeptAll();
		list.forEach(i->System.out.println(i));
		list.forEach(i->{System.out.println(i.getLoc());});
		//특정 위치만 뽑아내고자 할때.
	//람다 형식
	
	}
	
	

}
