package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil2 {

	public static Connection getConnection() {
		
		
		
		Connection con = null;
		
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("c:/lib/dbinfo.txt"));
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user =  p.getProperty("user");
			String pw =  p.getProperty("pw");
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, pw);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		
		//자원정리 해쥬는거
		try {
			if(rs != null)
				rs.close();
			if(con != null)
				con.close();
			if(st != null)
				st.close();
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
