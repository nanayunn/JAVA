//package test01;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import VO.DeptVO;
//import util.JDBCutil;
//
//public class Test05_DEPT {
//	public static void main(String[] args) {
//		//DeptVO vo = getDept(20);
//		//System.out.println(20+"  :  "+vo);
//		insertDept(90, "EDU", "SEOUL");
//		System.out.println("---------------------------");
//		List<DeptVO> list = getDeptAll();
//		System.out.println(list);
//		
//			
//	}
//		//public static int insertDept(int deptno, String dname, String loc) {
//			public static int insertDept() {
//			String sql =
//					"insert into dept(deptno, dname, loc) values(?, ?, ?)";
//					
//			Connection con = null;
//			PreparedStatement ps = null;
//			int result = 0;
//			
//			try {
//				con = JDBCutil.getConnection();
//				
//				ps = con.prepareStatement(sql);
//				ps.setInt(1, deptno);
//				ps.setString(2, dname);
//				ps.setString(3, loc);///물음표 자리 셋팅 작업
//				result = ps.executeUpdate();
//				
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally{
//				JDBCutil.close(con, ps, null);
//			}
//			
//			
//
//		
//
//	
//			return result;
//			
//		}
//	
//	
//	
//	
//	
//	
//	
//	
//	public static DeptVO getDept(int deptno) {
//		DeptVO vo = null;
//		String sql = "select * from dept where deptno = ?";
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//	
//		try {
//			con = JDBCutil.getConnection();
//			ps = con.prepareStatement(sql);
//			//세팅작업 
//			ps.setInt(1, deptno);
//			
//		
//			rs = ps.executeQuery();//select
//			
//			while(rs.next()) {
//				vo = new DeptVO();
//				vo.setDeptno(rs.getInt("deptno"));
//				vo.setDname(rs.getString("dname"));
//				vo.setLoc(rs.getString("loc"));
//				
//				
//			}
//			//insert update delete
//			
//			//결과값 핸들링
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			JDBCutil.close(con, ps, rs);
//		}
//		return vo;
//		
//	}
//	
//
//	public static List<DeptVO> getDeptAll() {
//		List<DeptVO> list = new ArrayList<DeptVO>();
//		String sql = "select * from dept";
//
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			con = JDBCutil.getConnection();
//			ps = con.prepareStatement(sql);
//		
//			rs = ps.executeQuery();
//			
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			JDBCutil.close(con, ps, rs);
//		}
//		
//		
//
//	
//
//
//		
//		return list;
//		
//	}
//	
//	
//}
