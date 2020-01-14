package com.test;

import java.util.ArrayList;

import com.sds.UserVO;
import com.sds.userDao;

public class UserSelectTest {

	public static void main(String[] args) {
		userDao dao=new userDao();
		
		try {
			UserVO v = dao.get("id01");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}


	}

}
