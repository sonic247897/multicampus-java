package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// ��ȣ, ���̵� ����
public class PreparedUpdateTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);	
		PreparedUpdateTest obj = new PreparedUpdateTest();
		System.out.print("boardNum:");
		int boardNum = key.nextInt();
		System.out.print("���̵�:");
		String id = key.next();
		System.out.println();
		obj.update(boardNum, id);
		
	}
	
	public void update(int boardNum, String id) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		String sql = "update tb_board set id = ? where boardnum =?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			con = DriverManager.getConnection(url, user, password);
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setString(1,id);
			ptmt.setInt(2, boardNum);
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			int result = ptmt.executeUpdate();
			System.out.println(result+"�� �� ������Ʈ ����");
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
