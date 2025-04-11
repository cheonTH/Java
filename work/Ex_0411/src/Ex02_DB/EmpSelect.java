package Ex02_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpSelect {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employees");
			
			while(rs.next()){
				int empno = rs.getInt("employee_id");
				String ename = rs.getString("First_name");
				String job = rs.getString("job_id");
				int salary = rs.getInt("salary");
				
				System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %d \n ", empno, ename, job, salary);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(rs != null) {
						rs.close();
					}
					if(stmt != null) {
						stmt.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}
