package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import web.vo.CarVO;
import web.vo.UserVO;

public class CarDao {

	public void insert(CarVO u) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.insertCar);
			
			pstmt.setString(1, u.getName());
			pstmt.setInt(2, u.getPrice());
			pstmt.setDouble(3, u.getCc());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null); 
		}
	}

//	public void delete(String id) throws Exception {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con = JDBCUtil.getConnection();
//			pstmt = con.prepareStatement(SQL.deleteUser);
//			pstmt.setInt(1, id);
//			pstmt.executeUpdate();
//		} catch (Exception e) {
//			throw e;
//		} finally {
//			JDBCUtil.close(con, pstmt, null); 
//		}
//
//	}
//
//	public void update(UserVO u) throws Exception {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		try {
//			con = JDBCUtil.getConnection();
//			pstmt = con.prepareStatement(SQL.updateUser);
//			pstmt.setString(1, u.getPwd());
//			pstmt.setString(2, u.getName());
//			pstmt.setString(3, u.getId());
//			pstmt.executeUpdate();
//		} catch (Exception e) {
//			throw e;
//		} finally {
//			JDBCUtil.close(con, pstmt, null);
//		}
//	}

//	public UserVO get(String id) throws Exception {
//		UserVO user = new UserVO();
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//
//		try {
//			con = JDBCUtil.getConnection();
//			pstmt = con.prepareStatement(SQL.selectUser);
//			pstmt.setString(1, id);
//			rset = pstmt.executeQuery();
//			while (rset.next()) {
//				user.setId(rset.getString("ID"));
//				user.setPwd(rset.getString("PWD"));
//				user.setName(rset.getString("NAME"));
//			}
//		} catch (Exception e) {
//			throw e;
//		} finally {
//			JDBCUtil.close(con, pstmt, rset);
//		}
//
//		return user;
//	}

	public ArrayList<CarVO> get() throws Exception {
		ArrayList<CarVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectAllCar);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				CarVO car = new CarVO();
				car.setId(rset.getInt("id"));
				car.setName(rset.getString("name"));
				car.setPrice(rset.getInt("price"));
				car.setCc(rset.getDouble("cc"));
				car.setRegdate(rset.getDate("regdate"));
				list.add(car);
			}

		} catch (Exception e) {
			throw e;

		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}
		return list;
	}
}
