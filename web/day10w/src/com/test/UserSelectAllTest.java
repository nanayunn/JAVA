package com.test;

import java.util.ArrayList;

import com.dao.UserDao;
import com.vo.UserVO;

public class UserSelectAllTest {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		ArrayList<UserVO> list = null;
		
		try {
			list = dao.get();
			for(UserVO vo:list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



