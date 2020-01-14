package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCutil;

public class Test02 {

	public static void main(String[] args) {
//		String driver =  "oracle.jdbc.driver.OracleDriver";
//		String url =  "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String user =  "SCOTT";
//		String pw =  "TIGER";
		
		String sql = 
		"select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여 "+
		"from emp "+
		"order by 총급여";
		
		System.out.println("JDBC TEST");
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		
//1. Driver 클래스를 로딩
try {
	//Class.forName(driver);
//2.로딩된 Driver 클래스르 이용해서 Connection 요청(url, user, id)
	con = JDBCutil.getConnection();
	
//3. 생선된 Connection으로부터 Statement 생성
	st = con.createStatement();
//4. Statement를 이용해서 sql 수행(execute, executeUpdate)
	rs = st.executeQuery(sql);

//5. 결과 처리 (ResultSet, int)
	while(rs.next()) {
		System.out.print(rs.getString("deptno")+"\t");
		System.out.print(rs.getString("ename")+"\t");
		System.out.print(rs.getString("sal")+"\t");
		System.out.print(rs.getString("comm")+"\t");
		System.out.print(rs.getString("총급여")+"\n");
		
	}
	} catch (Exception e) {
		
	//6.예외처리(SQLExeption 처리(try, catch, finally)
		System.out.println();
}finally{
	JDBCutil.close(con, st, rs);
//7. 자원정리(
//	try {
//	if(rs != null) rs.close();
//}catch(Exception e ) {
//	System.out.println(e.getMessage());
//}


	System.out.println("END");

	
	
	
	}

	}
}
