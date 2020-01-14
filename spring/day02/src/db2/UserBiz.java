package db2;

import java.util.ArrayList;

import common.UserVO;

public class UserBiz implements Biz<UserVO, String> {

		Dao dao;
		
		
		
		
		public void setDao(Dao dao) {
			this.dao=dao;
		}
		
		
	public UserBiz() {
			System.out.println("----------------------Create UserBiz");
		}
	
	
	public UserBiz(Dao dao) {
		this.dao = dao;
	}
	
	
	public void init() {
		System.out.println("---------init biz----------");
	}
	public void dest() {
		System.out.println("---------dest biz----------");
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
