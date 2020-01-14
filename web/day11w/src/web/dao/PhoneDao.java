package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import web.vo.PhoneVO;

public class PhoneDao {

	public void insert(PhoneVO u) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.insertPhone);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getName());
			pstmt.setInt(3, u.getPrice());
			pstmt.setInt(4, u.getAmount());
			pstmt.setDouble(5, u.getDiscount() * 100);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
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
			pstmt = con.prepareStatement(SQL.deletePhone);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null); 
		}

	}

	public void update(PhoneVO u) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.updatePhone);
			pstmt.setString(1, u.getName());
			pstmt.setInt(2, u.getPrice());
			pstmt.setInt(3, u.getAmount());
			pstmt.setDouble(4, u.getDiscount());
			pstmt.setString(5, u.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null);
		}
	}

	public PhoneVO get(String id) throws Exception {
		PhoneVO user = new PhoneVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectPhone);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			rset.next();
			user.setId(rset.getString("ID"));
			user.setName(rset.getString("NAME"));
			user.setPrice(rset.getInt("PRICE"));
			user.setAmount(rset.getInt("AMOUNT"));
			user.setDiscount(rset.getDouble("DISCOUNT"));
			
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}

		return user;
	}

	public ArrayList<PhoneVO> get() throws Exception {
		ArrayList<PhoneVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectAllPhone);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				PhoneVO user = new PhoneVO();
				user.setId(rset.getString("ID"));
				user.setName(rset.getString("NAME"));
				user.setPrice(rset.getInt("PRICE"));
				user.setAmount(rset.getInt("AMOUNT"));
				user.setDiscount(rset.getDouble("DISCOUNT"));
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
