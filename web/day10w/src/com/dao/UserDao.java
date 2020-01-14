package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vo.UserVO;

public class UserDao {

	public void insert(UserVO u) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.insertUser);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPwd());
			pstmt.setString(3, u.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null); 
		}
	}

	public void delete(String id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.deleteUser);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null); 
		}

	}

	public void update(UserVO u) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.updateUser);
			pstmt.setString(1, u.getPwd());
			pstmt.setString(2, u.getName());
			pstmt.setString(3, u.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null);
		}
	}

	public UserVO get(String id) throws Exception {
		UserVO user = new UserVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectUser);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				user.setId(rset.getString("ID"));
				user.setPwd(rset.getString("PWD"));
				user.setName(rset.getString("NAME"));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}

		return user;
	}

	public ArrayList<UserVO> get() throws Exception {
		ArrayList<UserVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectAllUser);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				UserVO user = new UserVO();
				user.setId(rset.getString("ID"));
				user.setPwd(rset.getString("PWD"));
				user.setName(rset.getString("NAME"));
				list.add(user);
			}

		} catch (Exception e) {
			throw e;

		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}
		return list;
	}
}
