package db;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import common.UserVO;

@Repository("udao")

public class UserOracleDao implements Dao<UserVO, String> {

	@Override
	public void insert(UserVO obj) {
		System.out.println("Oracle DB intserted:"+obj);
		
			
		}
	@Override
	public void delete(String id) {
		System.out.println("Oracle DB deleted:"+"id");
	}


	@Override
	public void update(UserVO obj) {
		System.out.println("Oracle DB updated:"+obj);
		
		// TODO Auto-generated method stub
	}

	@Override
	public UserVO select(String id) {
//		if(id.equals("id00")) {
//			throw new Exception();
//		}
		UserVO user = 
				new UserVO("id01","pwdo1","Á¹·Á");
		
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public ArrayList<UserVO> select() {
	ArrayList<UserVO> list =  new ArrayList<>();
	list.add(new UserVO("id01", "pwd01", "È£¹Ú°í±¸¸¶"));
	list.add(new UserVO("id02", "pwd02", "¿¬µÎºÎ"));
	list.add(new UserVO("id03", "pwd03", "°í·¡¹ä"));
	list.add(new UserVO("id04", "pwd04", "»ç°û"));
		return list;
	}

	

}
