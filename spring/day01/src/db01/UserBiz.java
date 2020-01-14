package db01;

import common.UserVO;

public class UserBiz {
	UserOracleDao dao;
	
	public void UserBiz() {
		dao = new UserOracleDao();
	}
	
	public void register(UserVO v) {
		//Transaction Start
		dao.insert(v);
		//Transaction End
	}
}
