package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		// ���� sql: sql���� �״�� �� ����
		String sql = "insert tb_board values(board_seq.nextval, 'jang','����','����',sysdate,0 )";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!!!"+con);
		}catch(ClassNotFoundException e) {
			System.out.println("����̹��ε� ����:"+ e.getMessage());
		}catch(SQLException e) {
			System.out.println("���� ����:"+e.getMessage());
		}
	
	}

}