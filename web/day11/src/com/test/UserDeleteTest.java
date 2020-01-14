package com.test;

import com.sds.UserVO;
import com.sds.userDao;

public class UserDeleteTest {

	public static void main(String[] args) {
		userDao dao = new userDao();
		UserVO user = 
				new UserVO("id10", null, null);
		try {
			dao.delete(user);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}

}
