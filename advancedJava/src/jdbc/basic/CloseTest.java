package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select id, title, content from tb_board";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connection 하나당 오라클 1라이센스(비용)
			// 반납 안하면 계속 메모리에 남아있다. Connection, Satatement, ResultSet
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			// select문을 실행
			rs = stmt.executeQuery(sql);
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
		}finally {//exception이 발생하지 않거나 발생하거나 무조건 실행할 명령문을 정의
			// 자원반납
			try{
				// con객체 만들다 오류 나서 finally 오면 nullptr 에러 뜸
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
