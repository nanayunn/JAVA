package db01;

import common.ItemVO;

public class ItemBiz {
	ItemOracleDao dao;
	
	public void ItemBiz() {
		dao = new ItemOracleDao();
	}
	
	public void register(ItemVO v) {
		//Transaction Start
		dao.insert(v);
		//Transaction End
	}
}
