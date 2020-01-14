package db;

import java.util.ArrayList;

public interface Dao<U,I> {
	public void insert(U obj);
	public void delete(I id);
	public void update(U obj);
	public  U select(I id);
	public ArrayList<U> select();

}
