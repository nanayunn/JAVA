package com.test;

import java.util.ArrayList;

import com.sds.UserVO;
import com.sds.userDao;

public class UserSelectAllTest {

	public static void main(String[] args) {
		userDao dao=new userDao();
		ArrayList<UserVO> list = null;
		
		try {
			list = dao.get();
			for(UserVO vo :list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
