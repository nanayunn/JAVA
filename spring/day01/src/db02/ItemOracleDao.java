package db02;

import common.ItemVO;

public class ItemOracleDao implements IDao<ItemVO, String> {

	@Override
	public void insert(ItemVO obj) {
		System.out.println("Oracle[insert]="+obj);
		
	}

	@Override
	public void delete(String id) {
		System.out.println("Oracle[delete]="+id);
		
		
	}

	@Override
	public void update(String id) {
		
		System.out.println("Oracle[update]="+id);
		
	}

	@Override
	public void get(ItemVO obj) {
		System.out.println("Oracle[get]="+obj);
		
		
	}

	@Override
	public void get() {
		System.out.println("Oracle[get]="+"");
		
		
	}

}
