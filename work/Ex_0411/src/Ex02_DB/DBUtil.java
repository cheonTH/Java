package Ex02_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB연결 전담 클래스
public class DBUtil {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String user = "hr";
	private static String password = "hr";
	
	//getConnection()메서드를 호출하면 db와 연결할 수 있는 conn객체를 얻을 수 있음
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
}
