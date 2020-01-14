package Users;

import java.util.List;

public class UserServiceImpl implements UserService{
	
	UserDAO dao = null;
	
	public UserServiceImpl() {	}

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}

	
	public void UpdateUsers(UserVO vo) {
		dao.UpdateUsers(vo);
	}

	@Override
	public void DeleteUsers(String id) {
		dao.DeleteUsers(id);
		
	}

	@Override
	public int insertUsers(UserVO vo) {
		// TODO Auto-generated method stub
		return dao.insertUsers(vo);
	}

	@Override
	public int insertUsers(String id, String password, String name) {
		// TODO Auto-generated method stub
		return dao.insertUsers(id, password, name);
	}

	@Override
	public UserVO getUser(String id) {
		// TODO Auto-generated method stub
		return dao.getUser(id);
	}

	@Override
	public List<UserVO> getUserAll() {
		return dao.getUserAll();
	}

}
