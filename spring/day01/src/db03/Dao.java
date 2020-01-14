package db03;

public interface Dao<K,A> {
	public void insert(K obj);
	public void delete(A id);
	public void update(K obj);
	public void select(K obj);
	public void select();

}
