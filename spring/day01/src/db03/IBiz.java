package db03;

public interface IBiz<O,T> {
	public void register(O obj);
	public void remove(T id);
	public void modify(T id);
	public void select(O obj);
	public void select();
}
