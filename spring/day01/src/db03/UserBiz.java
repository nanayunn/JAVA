package db03;

import common.UserVO;

public class UserBiz implements Biz<UserVO, String> {

	Dao dao;
	
	public UserBiz() {
		dao= (Dao) DaoFactory.getBean("useroracledao");
	}
	
	@Override
	public void register(UserVO obj) {
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
	public void get(UserVO obj) {
		dao.select(obj);
		
	}

	@Override
	public void get() {
		dao.select();
		
	}

}
