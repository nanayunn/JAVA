package db2;

import java.util.ArrayList;

public interface Biz<U,I> {
	public void register(U obj);
	public void remove(I id);
	public void modify(U obj);
	public U get(I id);
	public ArrayList<U> get();
	
}
