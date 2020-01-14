package db03;

public interface Biz<K,A> {
	public void register(K obj);
	public void remove(A id);
	public void modify(K obj);
	public void get(K obj);
	public void get();
	
}
