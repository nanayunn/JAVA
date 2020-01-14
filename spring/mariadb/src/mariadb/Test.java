package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.112.102:1521:XE";
		String id = "shop"; //shema 쓰는것, 유저 아이디 쓰는거 아님
		String pwd= "111111";
		String sql = "SELECT * FROM USERS";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rset = pstmt.executeQuery();
		
		while(rset.next()) {
			String idd = rset.getString("id");
			String pwdd = rset.getString("pwd");
			String name = rset.getString("name");
			int age = rset.getInt("age");
			System.out.println(idd+" "+pwdd+" "+name+" "+age);
			
		}
		
		rset.close();
		pstmt.close();
		con.close();

	}

}
