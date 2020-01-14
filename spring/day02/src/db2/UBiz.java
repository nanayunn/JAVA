package db2;

import java.util.ArrayList;

import common.UserVO;
import db.Biz;

public class UBiz implements Biz<UserVO, String> {

	
	public UBiz() {
		System.out.println("-----------Ubiz---------");
	}
	@Override
	public void register(UserVO obj) {
		System.out.println("--------------Ubiz register---------");
		
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(UserVO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserVO> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
