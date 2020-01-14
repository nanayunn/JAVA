package com.sds;

public class SQL {
	public static String insertUser
	= "INSERT INTO users VALUES(?,?,?)";
	public static String updateUser
	= "UPDATE users SET PWD=?, NAME=? WHERE ID=?";
	public static String deleteUser
	= "DELETE FROM users WHERE ID = ?";
	public static String selectUser
	= "SELECT * FROM users WHERE ID = ?";
	public static String selectAllUser
	= "SELECT * FROM users";
}
