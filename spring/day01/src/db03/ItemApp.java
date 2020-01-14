package db03;

import common.ItemVO;

public class ItemApp {

	public static void main(String[] args) {
		IBiz biz = new ItemBiz();
		
		ItemVO v = 
				new ItemVO("01", "shoe", 30000);
		biz.register(v);
		biz.modify("01");
		biz.remove("01");
		biz.select(v);
		biz.select();
	}

}
