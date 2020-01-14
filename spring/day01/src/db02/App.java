package db02;

import common.UserVO;

public class App {

	public static void main(String[] args) {
		Biz biz = new UserBiz();
		
		UserVO v = 
				new UserVO("01", "pwd01", "≈∏¿Ã∞≈");
		biz.register(v);


		biz.modify(v);
		
		
		biz.get(v);
		
		biz.get();
		
		biz.remove("01");
	}

}
