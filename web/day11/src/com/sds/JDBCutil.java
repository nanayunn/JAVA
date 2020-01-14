package com.sds;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil {

	public static Connection getConnection() {
		
		
		
		Connection con = null;
		
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("c:/lib/dbinfo.txt"));
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@70.12.113.206:1521:XE";
			String user =  "db";
			String pw =  "db";
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, pw);
			
		} catch (Exception e) { 
			
			e.printStackTrace();
		}
		
		return con;
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		
		//�옄�썝�젙由� �빐伊щ뒗嫄�
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
