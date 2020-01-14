package test01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCutil;

public class EmpManager {

	public static void main(String[] args) {
		
		String sql = "select jobs.job_title, employees.employee_id, employees.first_name, employee.salary " + 
				"from employees, jobs " + 
				"where jobs.job_title ="+ args[0];
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null; 
		int result = 0;
		
		try {
			con = JDBCutil.getConnection();
			st = con.createStatement();
			
			rs = st.executeQuery(sql);//select
			
			result = st.executeUpdate(sql);//insert update delete
			
			while(rs.next()) {
				System.out.print(rs.getString("job_title")+"\t");
				System.out.print(rs.getString("employee_id")+"\t");
				System.out.print(rs.getString("first_name")+"\t");
				System.out.print(rs.getString("salary")+"\n");

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCutil.close(con, st, rs);
		}

	}

}
