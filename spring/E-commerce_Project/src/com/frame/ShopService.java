package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;


public interface ShopService<K, V> extends Service<K, V> {

	@Transactional
	public void register(V v) throws Exception;

	@Transactional
	public void remove(K k) throws Exception;

	@Transactional
	public void modify(V v) throws Exception;

	public V get(K k) throws Exception;

	public ArrayList<V> get() throws Exception;

	public ArrayList<V> getDescName() throws Exception;

	public ArrayList<V> getAscName() throws Exception;

	public ArrayList<V> getDescPrice() throws Exception;

	public ArrayList<V> getAscPrice() throws Exception;
}
