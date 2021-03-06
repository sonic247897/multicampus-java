package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete from tb_board ");
		sql.append("where boardnum =");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개 행이 삭제됐습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getStackTrace());
		}catch(SQLException e) {
			System.out.println(e.getStackTrace());
			e.printStackTrace(); //오류 추적
		}
		
		
	}

}
