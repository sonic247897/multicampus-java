package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//전체 데이터 세팅하는것이므로 ? 세팅 X
public class PreparedSelectTest {
	public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		obj.select();
	}

	public void select() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select boardnum, id, title, content from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = 
					DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getString("content"));
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
