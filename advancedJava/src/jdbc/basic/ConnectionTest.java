package jdbc.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ����Ŭ�� �����ϱ�
public class ConnectionTest {
	public static void main(String[] args) {
		// 127.0.0.1 = localhost = ���� �۾� ���� �� pc
		// 1521��Ʈ = application�� ���� ��Ʈ
		// ���Ṯ�ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����.
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";
		// ���ݿ� �ִ� ���� DB���� ip
		String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert tb_board values(board_seq.nextval, 'jang','����','����',sysdate,0 )";
		// sql���� �����ݷ� ������ �ȵȴ�!!
		try {
			// 1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			System.out.println("����̹��ε� ����!!");
			// 2. DBMS�� �����ϱ� - ���������� ����
			//	 => DBMS�� �����ϰ� ���������� ConnectionŸ������ ��ȯ�Ѵ�. 
			Connection con =
					DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��:"+con); // ��ü�� �ּ� ��� 
			// ������ ������� ��ü�� oracle.jdbc.driver.�� �ִ� T4CConnection Ŭ������
			// ���ο��� �ڹ� ǥ��API�� Connection�� implements�ؼ� �����ϰ� �ִ�.(������!!)
			// �θ� Ŭ���� Ÿ������ �ڽ� ��ü ����ų �� ����
			
			// 3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ� 
										// Connection��ü�� �̿��ؼ� ����
			Statement stmt = con.createStatement();
			System.out.println("SQL���� �����ϱ� ���� ��ü����:" +stmt);
			// ǥ�� API(java.sql)�� Statement�� �޾����� �����δ� 
			//OracleStatementWrapper ��ü�� �����ȴ�.
		
			// 4. sql�����ϱ�
			int result = stmt.executeUpdate(sql);
			// 5. ��� ó���ϱ�
			System.out.println(result+"�� �� ���Լ���");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			// SQL���� �߸� �ᵵ �������� ���� ������ ������а� ���!
			// (ORA-~~ �� SQL syntax error)
			e.printStackTrace(); //�������� �޼ҵ�
		}
	}

}