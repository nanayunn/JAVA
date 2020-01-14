package test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCutil;

public class Test03 {
	public static void main(String[] args) {
		
		String sql = 
		"select ename, job, sal, deptno, hiredate " +
				"from emp "+
		//"where deptno=" + args[0];
		
		//"where deptno=" + args[0]+ "or deptno="+args[1];
		
		//"where enmae = '"+args[0]+"'";
		
		"where deptno = ? or deptno = ?";
		
		Connection con = null;
		PreparedStatement st = null;//sql문에 물음표가 있으면 이걸로 바뀜
//		Statement st = null; 
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			//st = con.createStatement();
			st = con.prepareStatement(sql);
			
			st.setInt(1, 10);
			st.setInt(2, 20);
			
			rs = st.executeQuery();
//			rs = st.executeQuery(sql);//select
			
			//result = st.executeUpdate(sql);//insert update delete
			
			//결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("sal")+"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getDate("hiredate")+"\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCutil.close(con, st, rs);
		}
		
		

	}

}











