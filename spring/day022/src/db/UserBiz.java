package db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import common.UserVO;

@Service("ubiz")

public class UserBiz implements Biz<UserVO, String> {

	
		@Autowired
		@Qualifier("udao")
		
		//@Resource(name="udao")
		//객체 생성 안했지만 스프링이 알아서 넣어준다.
		Dao dao;
		
		
		
	public UserBiz() {
			System.out.println("----------------------Create UserBiz");
		}
	

	@Override
	public void register(UserVO obj) {
		System.out.println("----register-----");
		dao.insert(obj);
		
	}

	@Override
	public void remove(String id) {
		dao.delete(id);
		
	}

	@Override
	public void modify(UserVO obj) {
		dao.update(obj);
	}

	@Override
	public UserVO get(String id) {
		return (UserVO) dao.select(id);
	}

	@Override
	public ArrayList<UserVO> get() {
		return dao.select();
	}

}
