package db02;

import common.UserVO;

public class UserOracleDao implements Dao<UserVO, String> {

	@Override
	public void insert(UserVO obj) {
		System.out.println("[Oracle] Insert:"+obj);
		
	}

	@Override
	public void delete(String id) {
		System.out.println("[Oracle] delete:"+id);
		
		
	}

	@Override
	public void update(UserVO obj) {
		System.out.println("[Oracle] update:"+obj);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(UserVO obj) {
		System.out.println("[Oracle] select:"+obj);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		System.out.println("[Oracle] select:"+"");
		// TODO Auto-generated method stub
		
	}

}
