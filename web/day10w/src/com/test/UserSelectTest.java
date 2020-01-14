package com.test;

import com.dao.UserDao;
import com.vo.UserVO;

public class UserSelectTest {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		UserVO dbuser = null;
		
		try {
			dbuser = dao.get("idxx");
			System.out.println(dbuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
