package db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import common.UserVO;
import log.LogAdvice;

@Service("ubiz")

public class UserBiz implements Biz<UserVO, String> {

	
		@Autowired
		@Qualifier("udao")
		
		//@Resource(name="udao")
		//객체 생성 안했지만 스프링이 알아서 넣어준다.
		Dao dao;
		
		//LogAdvice log;
		
	public UserBiz() {
			System.out.println("----------------------Create UserBiz");
			//log = new LogAdvice();
		}
	

	@Override
	public void register(UserVO obj) {
		//System.out.println("----register-----");
		//log.logPrint();
		dao.insert(obj);
		
	}

	@Override
	public void remove(String id) {
		//log.logPrint();
		dao.delete(id);
		
	}

	@Override
	public void modify(UserVO obj) {
		dao.update(obj);
	}

	@Override
	public UserVO get(String id) {
		System.out.println("start GET");
		try {
			Thread.sleep(234);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (UserVO) dao.select(id);
	}

	@Override
	public ArrayList<UserVO> get() {
		return dao.select();
	}

}
