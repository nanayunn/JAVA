package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import web.vo.PantsVO;

public class PantsDao {
	
	public void insert(PantsVO v) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.insertPants);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAmount());
			pstmt.setInt(4, v.getPrice());
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
			pstmt = con.prepareStatement(SQL.deletePants);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null); 
		}

	}
	
	public void update(PantsVO v) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.updatePants);
			pstmt.setString(4, v.getId());
			pstmt.setString(1, v.getName());
			pstmt.setInt(3, v.getAmount());
			pstmt.setInt(2, v.getPrice());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, null);
		}
	}

	public PantsVO get(String id) throws Exception {
		PantsVO pants = new PantsVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectPants);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				pants.setId(rset.getString("id"));
				pants.setName(rset.getString("name"));
				pants.setAmount(rset.getInt("amount"));
				pants.setPrice(rset.getInt("price"));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}

		return pants;
	}

	public ArrayList<PantsVO> get() throws Exception {
		ArrayList<PantsVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(SQL.selectAllPants);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				PantsVO pants = new PantsVO();
				pants.setId(rset.getString("id"));
				pants.setName(rset.getString("name"));
				pants.setAmount(rset.getInt("amount"));
				pants.setPrice(rset.getInt("price"));
				list.add(pants);
			}

		} catch (Exception e) {
			throw e;

		} finally {
			JDBCUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
	
}
