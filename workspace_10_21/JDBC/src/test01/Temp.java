package test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCutil;

public class Temp {
	public static void main(String[] args) {
		
		String sql = "";
		Connection con = null;
		PreparedStatement ps = null;
//		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			ps = con.prepareStatement(sql);
			//세팅작업 
			rs = ps.executeQuery();//select
			
			result = ps.executeUpdate();//insert update delete
			
			//결과값 핸들링
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCutil.close(con, ps, rs);
		}
		
		

	}

}











