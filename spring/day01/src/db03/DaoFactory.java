package db03;

public class DaoFactory {
	
	public static Object getBean(String name) {
		Object obj = null;
		if(name.equalsIgnoreCase("useroracledao")) {
			obj = new UserOracleDao();
		}else if(name.equals("usermariadao")){
	}
		return obj;
}
}
