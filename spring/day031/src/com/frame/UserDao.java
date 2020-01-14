package com.frame;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.vo.UserVO;

@Repository("udao")

public class UserDao implements Dao<String, UserVO> {

	@Override
	public void insert(UserVO v) throws Exception {
		System.out.println("inserted...."+v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO select(String k) throws Exception {
		UserVO user = new UserVO("id99","pwd99","Á¹·Á");
		return user;
	}

	@Override
	public ArrayList<UserVO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
