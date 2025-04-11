package Ex01_Reflection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class OracleConnect {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//jdbc : 자비 DB연결
		//oracle : 오라클DB를 의미
		//thin : 오라클에서 제공하는 경량 드라이버
		//localhost : DB기본 주소(자기 컴퓨터)
		//1521 : 기본 포트
		//xe : 오라클 SID
		String user = "hr";
		String password = "hr";
		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//conn : db연결을 생성
			conn = DriverManager.getConnection(url, user, password);
			
			//문져열 형태의 sql을 실제로 오라클로 전달해서 실행을 하기 위한 과정
			stmt = conn.createStatement();
			//executeQuery() : sql을 실행한 결과를 ResultSet타입으로 받음
			rs = stmt.executeQuery("select * from employees");
			System.out.println("Oracle DB연결 성공");
			
			//조회된 데이터를 console에 출력
			//next() : 다음에 읽어올 행이 있으면 true
			while(rs.next()) {
				System.out.println(rs.getInt("employee_id") + " / "  + rs.getString("First_name") + " / " + rs.getString("Hire_date"));
			}
		} catch (Exception e) {
			// TODO: handle exception
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
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
