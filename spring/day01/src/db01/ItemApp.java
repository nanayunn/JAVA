package db01;

import common.ItemVO;

public class ItemApp {

	public static void main(String[] args) {
		ItemBiz biz = new ItemBiz();
		
		ItemVO v = 
				new ItemVO("id", "name", 555);
		biz.register(v);

	}

}
