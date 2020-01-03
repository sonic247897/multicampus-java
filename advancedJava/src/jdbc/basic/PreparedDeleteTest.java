package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// ��ȣ, ���̵� ����
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
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setInt(1, boardNum);
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			int result = ptmt.executeUpdate();
			System.out.println(result+"�� �� ���� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
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