package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 번호, 아이디 수정
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);	
		PreparedDeleteTest obj = new PreparedDeleteTest();
		System.out.print("boardNum:");
		int boardNum = key.nextInt();
		System.out.println();
		obj.delete(boardNum);
		
	}
	
	public void delete(int boardNum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		String sql = "delete from tb_board where boardnum =?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			con = DriverManager.getConnection(url, user, password);
			//1. PreparedStatement 생성
			ptmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setInt(1, boardNum);
			//3. 실행하기
			// 위에서 sql파싱 했으므로 매개변수 x
			int result = ptmt.executeUpdate();
			System.out.println(result+"개 행 삭제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			try {
				if(ptmt != null) ptmt.close();
				if(con != null) con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
