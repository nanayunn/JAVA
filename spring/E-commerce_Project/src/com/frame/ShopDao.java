package com.frame;

import java.util.ArrayList;

import com.vo.ProductVO;

public interface ShopDao<K, V> extends Dao<K, V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	public ArrayList<ProductVO> selectAscName() throws Exception;
	public ArrayList<ProductVO> selectDescName() throws Exception;
	public ArrayList<ProductVO> selectAscPrice() throws Exception;
	public ArrayList<ProductVO> selectDescPrice() throws Exception;
}
