package jdbc.basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 오라클에 접속하기
public class ConnectionTest {
	public static void main(String[] args) {
		// 127.0.0.1 = localhost = 현재 작업 중인 내 pc
		// 1521포트 = application이 쓰는 포트
		// 연결문자열 - 어떤 DBMS를 쓰느냐에 따라 형식이 달라진다.
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";
		// 원격에 있는 실제 DB서버 ip
		String url = "jdbc:oracle:thin:@70.12.115.55:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert tb_board values(board_seq.nextval, 'jang','연습','연습',sysdate,0 )";
		// sql문에 세미콜론 찍으면 안된다!!
		try {
			// 1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			System.out.println("드라이버로딩 성공!!");
			// 2. DBMS에 연결하기 - 연결정보를 정의
			//	 => DBMS에 연결하고 연결정보를 Connection타입으로 반환한다. 
			Connection con =
					DriverManager.getConnection(url, user, password);
			System.out.println("연결성공:"+con); // 객체의 주소 출력 
			// 실제로 만들어진 객체는 oracle.jdbc.driver.에 있는 T4CConnection 클래스는
			// 내부에서 자바 표준API인 Connection을 implements해서 구현하고 있다.(다형성!!)
			// 부모 클래스 타입으로 자식 객체 가리킬 수 있음
			
			// 3. sql을 실행하기 위한 객체를 생성 - 연결정보와 연결시켜야 하므로 
										// Connection객체를 이용해서 생성
			Statement stmt = con.createStatement();
			System.out.println("SQL문을 실행하기 위한 객체정보:" +stmt);
			// 표준 API(java.sql)인 Statement로 받았지만 실제로는 
			//OracleStatementWrapper 객체가 생성된다.
		
			// 4. sql실행하기
			int result = stmt.executeUpdate(sql);
			// 5. 결과 처리하기
			System.out.println(result+"개 행 삽입성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			// SQL문을 잘못 써도 이쪽으로 오기 때문에 연결실패가 뜬다!
			// (ORA-~~ 는 SQL syntax error)
			e.printStackTrace(); //오류추적 메소드
		}
	}

}
