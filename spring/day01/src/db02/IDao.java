package db02;

public interface IDao<O,T> {
	public void insert(O obj);
	public void delete(T id);
	public void update(T id);
	public void get(O obj);
	public void get();
}
