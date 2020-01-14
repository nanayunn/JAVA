package db01;

import common.UserVO;

public class App {

	public static void main(String[] args) {
		UserBiz biz = new UserBiz();
		
		UserVO v = 
				new UserVO("id", "pwd", "name");
		biz.register(v);

	}

}
