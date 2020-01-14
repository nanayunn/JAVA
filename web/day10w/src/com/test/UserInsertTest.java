package com.test;

import com.dao.UserDao;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		UserVO user = 
		new UserVO("id11","pwd11","È«¸»¼÷");
		try {
			dao.insert(user);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}



