package Ex02_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	
	public static List<Emp> find(String job){
		List<Emp> list = new ArrayList<Emp>();
		
		//emp테이블에서 사원번호, 이름, 직종, 급여 을 조회해서 하나의 행을 emp객체에 넣은후 그 객체들을  arraylist에 담아서 반환
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT employee_id, First_name, job_id, salary FROM employees WHERE job_id = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//첫번째 물음표자리에 매개변수로 들어온 job 값으로 채움 job값이 sql문의 ?로 들어감
			pstmt.setString(1, job);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Emp e = new Emp();
				e.setEmpno(rs.getInt("employee_id"));
				e.setEname(rs.getString("First_name"));
				e.setJob(rs.getString("job_id"));
				e.setSalary(rs.getInt("salary"));
				
				list.add(e);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(rs != null) {
						rs.close();
					}
					if(pstmt != null) {
						pstmt.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return list;
		
	}
}
