package com.sds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class userDao {
	
		public void insert(UserVO u) throws Exception{
		
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
			con = JDBCutil.getConnection();
			pstmt = 
					con.prepareStatement(SQL.insertUser);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPwd());
			pstmt.setString(3, u.getName());
			pstmt.executeUpdate();
			}catch(Exception e){ 
				throw e;
			}finally {
			JDBCutil.close(con, pstmt, null);
			}
			//return i;
		}
		
		
		
		
		public void delete(UserVO u) throws Exception{
			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			
			try {
				con = JDBCutil.getConnection();
				pstmt = con.prepareStatement(SQL.deleteUser);
				//세팅작업 			
				pstmt.setString(1, u.getId());
				pstmt.executeUpdate();//insert update delete
				
				//결과값 핸들링
				
				
			}catch(Exception e){
				throw e;
			}finally{
				
				JDBCutil.close(con, pstmt, null);
				}
			}

		




		public void update(UserVO u) throws Exception{

			Connection con = null;
			PreparedStatement pstmt = null;		
			
			try {
				con = JDBCutil.getConnection();
				pstmt = con.prepareStatement(SQL.updateUser);
				//세팅작업 			
				pstmt.setString(1, u.getPwd());
				pstmt.setString(2, u.getName());
				pstmt.setString(3, u.getId());
				pstmt.executeUpdate();//insert update delete
				
				//결과값 핸들링
				
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
				
				JDBCutil.close(con, pstmt, null);
				}
		}
	
		
		
		public UserVO get(String id) throws Exception{
			UserVO user = null;
			return user;
			}
		
		
		
		
		public ArrayList<UserVO> get() throws Exception{
			
			ArrayList<UserVO> list = 
			new ArrayList<>();
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			
			try {
				con = JDBCutil.getConnection();
				pstmt = con.prepareStatement(SQL.selectAllUser);
				rset = pstmt.executeQuery();
				while(rset.next()) {
				UserVO user = new UserVO();
				user.setId(rset.getString("ID"));
				user.setPwd(rset.getString("PWD"));
				user.setName(rset.getString("NAME"));
				list.add(user);
				}
			}catch (Exception e) {
				throw e;
			}finally {
				JDBCutil.close(con, pstmt, rset);
			}
			
			return list;
			}
	
//	public void register(String id, String pwd,String name) throws Exception {
//			if(id.equals("aa")) {
//				throw new Exception();
//			}else {
//				System.out.println("OK");
//			}
//	}
//
//	public ArrayList<UserVO> select() throws Exception{
//		ArrayList<UserVO>
//			list = new ArrayList<>();
//		list.add(new UserVO("id1", "name1", "pwd1"));
//		list.add(new UserVO("id2", "name2", "pwd2"));
//		list.add(new UserVO("id3", "name3", "pwd3"));
//		list.add(new UserVO("id4", "name4", "pwd4"));
//		list.add(new UserVO("id5", "name5", "pwd5"));
//		return list;
}


