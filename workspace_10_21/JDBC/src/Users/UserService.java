package Users;

import java.util.List;

public interface UserService {

	public void UpdateUsers(UserVO vo);
	public  void DeleteUsers(String id);
	public  int insertUsers(UserVO vo);
	public int insertUsers(String id, String password, String name);
	public UserVO  getUser(String id);
	 public List<UserVO>  getUserAll();
	
}
