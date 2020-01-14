package web.dao;

public class SQL {
	public static String insertUser
	= "INSERT INTO USERS VALUES(?,?,?)";
	public static String updateUser
	= "UPDATE USERS SET PWD=?,NAME=? WHERE ID=?";
	public static String deleteUser
	= "DELETE FROM USERS WHERE ID=?";
	public static String selectUser
	= "SELECT * FROM USERS WHERE ID=?";
	public static String selectAllUser
	= "SELECT * FROM USERS";
	
	
	public static String insertCar
	="INSERT INTO CARS VALUES(C_SEQ.NEXTVAL,?,?,?,SYSDATE)";
	public static String selectAllCar
	="SELECT * FROM CARS";
}



