package com.mapper;

import java.util.ArrayList;

import com.vo.CartVO;


public interface CartMapper {
	public void insert(CartVO obj);
	public void delete(String obj);
	public void update(CartVO obj);
	public CartVO select(String obj);
	public ArrayList<CartVO> selectall(String obj);
	public ArrayList<CartVO> cselect();
	public int count(String obj);
}
