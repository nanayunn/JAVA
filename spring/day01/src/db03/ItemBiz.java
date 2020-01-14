package db03;

import common.ItemVO;

public class ItemBiz implements IBiz<ItemVO, String> {

	
	IDao idao;
	
	
	public ItemBiz() {
		idao=new ItemOracleDao();
		
	}

	public void register(ItemVO obj) {
		idao.insert(obj);
	}

	@Override
	public void remove(String id) {
		idao.delete(id);
	
	}

	@Override
	public void modify(String id) {
		idao.update(id);
		
	}

	@Override
	public void select(ItemVO obj) {
		idao.get(obj);
		
	}

	@Override
	public void select() {
		idao.get();
		
	}

}
