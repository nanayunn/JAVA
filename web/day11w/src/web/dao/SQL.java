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
	
	

	public static String insertPants = "INSERT INTO PANTS VALUES(?,?,?,?)";
	 public static String updatePants = "UPDATE PANTS SET NAME=?,PRICE=?,AMOUNT=? WHERE ID=?";
	 public static String deletePants = "DELETE FROM PANTS WHERE ID=?";
	 public static String selectPants = "SELECT * FROM PANTS WHERE ID=?";
	 public static String selectAllPants = "SELECT * FROM PANTS";
	 

	 public static String insertPhone = "INSERT INTO PHONES VALUES(?,?,?,?,?)";
	 public static String updatePhone = "UPDATE PHONES SET NAME=?,PRICE=?,AMOUNT=?,DISCOUNT=? WHERE ID=?";
	 public static String deletePhone = "DELETE FROM PHONES WHERE ID=?";
	 public static String selectPhone = "SELECT * FROM PHONES WHERE ID=?";
	 public static String selectAllPhone = "SELECT * FROM PHONES";
}



