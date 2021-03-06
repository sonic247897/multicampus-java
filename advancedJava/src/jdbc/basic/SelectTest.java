package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 전체 데이터 세팅하는것이므로 ? 세팅 x
public class SelectTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select id, title, content from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connection 하나당 오라클 1라이센스(비용)
			// 반납 안하면 계속 메모리에 남아있다. Connection, Satatement, ResultSet
			Connection con = 
					DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			// select문을 실행
			ResultSet rs = stmt.executeQuery(sql);
			// 오라클에서 제공해주는 ResultSet의 하위 객체 OracleResultSetImpl
			System.out.println("rs: "+rs);
			// ResultSet에 레코드가 존재하는 동안 반복문을 실행
			while(rs.next()) { //=> 레코드를 조회하기 위해서는
								// 레코드가 한 개라도 반드시 커서를 이동시켜야 한다.
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				// 컬럼명을 써도 된다.
				System.out.println(rs.getString("content"));
				/*System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));*/
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
