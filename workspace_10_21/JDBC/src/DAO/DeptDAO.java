package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import VO.DeptVO;
import util.JDBCutil;

public class DeptDAO {
	
	
	public void UpdateDept(DeptVO vo) {
		String sql = "update dept set loc=? where deptno =?";
		
		Connection con = null;
		PreparedStatement ps = null;
//		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			ps = con.prepareStatement(sql);
			//세팅작업 //
			ps.setString(1, vo.getLoc());
			ps.setInt(2, vo.getDeptno());//autocommit 이니까 조심해야함
			
			result = ps.executeUpdate();//insert update delete
			
			//결과값 핸들링
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCutil.close(con, ps, rs);
		}
		
		

	}
		
	
	public  void DeleteDept(int deptno) {
		String sql = "delete from dept where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
//		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			//세팅작업 			
			ps.setInt(1, deptno);
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
	
	public  int insertDept(DeptVO vo) {
		return insertDept(vo.getDname(), vo.getLoc());
	}

	public int insertDept(String dname, String loc) {
		String sql =
		"insert into dept (deptno,dname,loc) "
		+"values(((select nvl(max(deptno),0)+1 from dept)),?,?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = JDBCutil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅 작업
			//ps.setInt(1, deptno);
			ps.setString(1, dname);
			ps.setString(2, loc);
			
			result = ps.executeUpdate(); //insert update delete
		} catch (Exception e) {
          e.printStackTrace();
		} finally {
			JDBCutil.close(con, ps, null);
		}
		return result;
	}
	
	
    public DeptVO  getDept(int deptno) {
    	DeptVO vo = null;
    	String sql = "select * from dept where deptno = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCutil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅 작업
			ps.setInt(1, deptno);
			rs = ps.executeQuery();  //select
			//결과값핸들링
			while(rs.next()) {
				vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
			}
			
		} catch (Exception e) {
          e.printStackTrace();
		} finally {
			JDBCutil.close(con, ps, rs);
		}
		return vo;
	}
    public List<DeptVO>  getDeptAll() {
    	List<DeptVO> list = new ArrayList<DeptVO>();
    	String sql = "select * from dept ";
    	
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
				DeptVO vo = new DeptVO();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				
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



