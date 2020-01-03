package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board"
				+ " set id = 'kang'"
				+ " where boardnum =2"; //StringBuilder나 Buffer쓰는게 좋음
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 행이 수정됐습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getStackTrace());
		}catch(SQLException e) {
			System.out.println(e.getStackTrace());
			e.printStackTrace(); //오류 추적
		}
		
		
	}

}
