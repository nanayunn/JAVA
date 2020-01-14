package db;

import java.util.ArrayList;

import common.UserVO;

public class UserBiz implements Biz<UserVO, String> {

		Dao<UserVO,String> dao;
		
		
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
		return dao.select(id);
	}

	@Override
	public ArrayList<UserVO> get() {
		return dao.select();
	}

}
