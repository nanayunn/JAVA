package web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	public static Connection getConnection() {

		Connection con = null;

		try {
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@70.12.113.207:1521:XE";
			String user = "db";
			String pw = "db";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return con;
	}

	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
