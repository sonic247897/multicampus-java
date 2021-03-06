package work.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// 드라이버 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// connection 함수
	public static Connection getConnect() {
		Connection con = null;
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {	
			con = DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}		

	// finally~ 자원반납 함수
	public static void close(ResultSet rs, Statement stmt,
								Connection con ) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
