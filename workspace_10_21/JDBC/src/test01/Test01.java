package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args) {
		String driver =  "oracle.jdbc.driver.OracleDriver";
		String url =  "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user =  "SCOTT";
		String pw =  "TIGER";
		
		String sql = "select * from dept"; ///세미콜론 따옴표 안에는 넣지 말기
		
		System.out.println("JDBC TEST");
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		
//1. Driver 클래스를 로딩
try {
	Class.forName(driver);
//2.로딩된 Driver 클래스르 이용해서 Connection 요청(url, user, id)
	con = DriverManager.getConnection(url, user, pw);
	
//3. 생선된 Connection으로부터 Statement 생성
	st = con.createStatement();
//4. Statement를 이용해서 sql 수행(execute, executeUpdate)
	rs = st.executeQuery(sql);

//5. 결과 처리 (ResultSet, int)
	while(rs.next()) {
		System.out.print(rs.getString("deptno")+"\t");
		System.out.print(rs.getString("dname")+"\t");
		System.out.print(rs.getString("loc")+"\n");
		
	}
	} catch (Exception e) {
		
	//6.예외처리(SQLExeption 처리(try, catch, finally)
		System.out.println();
}finally{
//7. 자원정리(
	try {
	if(rs != null) rs.close();
}catch(Exception e ) {
	System.out.println(e.getMessage());
}


	System.out.println("END");

	
	
	
	}

	}
}
