package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		// 정적 sql: sql문을 그대로 다 써줌
		String sql = "insert tb_board values(board_seq.nextval, 'jang','연습','연습',sysdate,0 )";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공!!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공!!!"+con);
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패:"+ e.getMessage());
		}catch(SQLException e) {
			System.out.println("연결 실패:"+e.getMessage());
		}
	
	}

}
