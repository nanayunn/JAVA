package Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import util.JDBCutil;

public class UserDAO {
	public void UpdateUsers(UserVO vo) {
		String sql = "update users set id=? and pw=? where name =?";
		
		Connection con = null;
		PreparedStatement ps = null;
//		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			ps = con.prepareStatement(sql);
			//세팅작업 //
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());//autocommit 이니까 조심해야함
			ps.setString(3, vo.getName());//autocommit 이니까 조심해야함
			
			result = ps.executeUpdate();//insert update delete
			
			//결과값 핸들링
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCutil.close(con, ps, rs);
			}
		}
		
		public  void DeleteUsers(String id) {
			String sql = "delete from users where id= ?";
			Connection con = null;
			PreparedStatement ps = null;
//			Statement st = null;
			ResultSet rs = null;
			int result = 0;
			
			try {
				con = JDBCutil.getConnection();
				con.setAutoCommit(false);
				ps = con.prepareStatement(sql);
				//세팅작업 			
				ps.setString(1, id);
				result = ps.executeUpdate();//insert update delete
				
				//결과값 핸들링
				
				con.rollback();//delete 수행했다가 취소될것. 
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
				try {
					con.setAutoCommit(true);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				JDBCutil.close(con, ps, rs);
				}
			}

			public  int insertUsers(UserVO vo) {
				return insertUsers(vo.getId(), vo.getPassword(), vo.getName());
			}

			public int insertUsers(String id, String password, String name) {
				String sql =
						"insert into users(id, password, name, date_of_birth) "+ 
						"values(?, ?, ?)";
				Connection con = null;
				PreparedStatement ps = null;
				int result = 0;
				try {
					con = JDBCutil.getConnection();
					ps = con.prepareStatement(sql);
					//? 세팅 작업
				
					ps.setString(1, id);
					ps.setString(2, password);
					ps.setString(3, name);
					
					result = ps.executeUpdate(); //insert update delete
				} catch (Exception e) {
		          e.printStackTrace();
				} finally {
					JDBCutil.close(con, ps, null);
				}
				return result;
			}
			
			 public UserVO  getUser(String id) {
			    	UserVO vo = null;
			    	String sql = "select id, pw, name from Users where id =? ";
					Connection con = null;
					PreparedStatement ps = null;
					ResultSet rs = null;
					
					try {
						con = JDBCutil.getConnection();
						ps = con.prepareStatement(sql);
						//? 세팅 작업
						ps.setString(1, id);
					
						rs = ps.executeQuery();  //select
						//결과값핸들링
						while(rs.next()) {
							vo = new UserVO();
							vo.setId(rs.getString("id"));
							vo.setPassword(rs.getString("password"));
							vo.setName(rs.getString("name"));
						}
						
					} catch (Exception e) {
			          e.printStackTrace();
					} finally {
						JDBCutil.close(con, ps, rs);
					}
					return vo;
				}
			
			 public List<UserVO>  getUserAll() {
			    	List<UserVO> list = new ArrayList<UserVO>();
			    	String sql = "select * from Users ";
			    	
					Connection con = null;
					PreparedStatement ps = null;
					ResultSet rs = null;
					
					try {
						con = JDBCutil.getConnection();
						ps = con.prepareStatement(sql);
						//? 세팅 작업
						
						rs = ps.executeQuery();  //select
						//결과값핸들링
						while(rs.next()) {
							UserVO vo = new UserVO();
							vo.setId(rs.getString("id"));
							vo.setPassword(rs.getString("password"));
							vo.setName(rs.getString("name"));
							
							list.add(vo);
						}
						
					} catch (Exception e) {
			          e.printStackTrace();
					} finally {
						JDBCutil.close(con, ps, rs);
					}
			    	return list;
				}
	}


