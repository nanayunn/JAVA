package com.test;

import com.sds.UserVO;
import com.sds.userDao;

public class UserUpdateTest {

	public static void main(String[] args) {
		userDao dao = new userDao();
		UserVO user = 
				new UserVO("id10", "pwd11", "choi");
		try {
			dao.update(user);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
		

	}

}
