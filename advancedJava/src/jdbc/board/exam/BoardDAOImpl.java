package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//tb_board테이블을 액세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board) {
		System.out.println("dto사용메소드:"+board); //toString 출력
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0; //메소드 실행결과과 저장될 변수
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		
		try {
			con = DBUtil.getConnect(); //DBMS 연결
			//1. PreparedStatement 생성
			ptmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			//3. 실행하기
			// 위에서 sql파싱 했으므로 매개변수 x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result; //오류 나면 0 리턴
	}
	
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0; //메소드 실행결과가 저장될 변수
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		
		try {
			con = DBUtil.getConnect(); //DBMS 연결
			//1. PreparedStatement 생성
			ptmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setString(1,id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			//3. 실행하기
			// 위에서 sql파싱 했으므로 매개변수 x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result; //오류 나면 0 리턴
	}
	
	public int update(int boardNum, String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result =0;
		String sql = "update tb_board set id = ? where boardnum =?";
		
		try {
			con = DBUtil.getConnect();
			//1. PreparedStatement 생성
			ptmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setString(1,id);
			ptmt.setInt(2, boardNum);
			//3. 실행하기
			// 위에서 sql파싱 했으므로 매개변수 x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete from tb_board where boardnum =?";
		
		try {
			con = DBUtil.getConnect();
			//1. PreparedStatement 생성
			ptmt = con.prepareStatement(sql);
			//2. ?에 값 전달하기
			ptmt.setInt(1, boardNum);
			//3. 실행하기
			// 위에서 sql파싱 했으므로 매개변수 x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public ArrayList<BoardDTO> select() {
		// 전체 게시글을 담을 Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		// 조회한 게시글을 담을 객체
		// 객체를 생성하지 않고 null로 초기화하는 이유
		// -> 데이터를 조회하는 작업을 하는 곳이 while문 내부이므로
		//	 while문에서 객체를 생성
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			// rs.next() 한번 하면 첫번째 레코드로 이동
			while(rs.next()) {
				// 1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				board = new BoardDTO(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				// 2. DTO로 변환된 레코드를 ArrayList에 추가
				boardlist.add(board);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardlist;
	}

	// 게시글 읽기 - R
	@Override
	public BoardDTO read(int boardnum) {
		BoardDTO board = null;
		String sql = "select * from tb_board where boardnum = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardnum);
			rs = ptmt.executeQuery();
			if(rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return board;
	}

	//게시글 제목으로 검색 - L
	@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		// !주의 - 완전 일치하는 거 말고 포함하는것도 가져와야 함
		// ? 둘레에는 '' 못쓴다!
		// 함수 안에 물음표 찍는건 괜찮음
		//String sql = "select * from tb_board where title like concat('%',concat(?,'%')) ";
		String sql = "select * from tb_board where title like '%'||?||'%'";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, title);
			// ptmt.setString(1, "%"+title+"%");
			rs = ptmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				boardlist.add(board);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardlist;
	}

	@Override
	public void hitUpdate(int boardnum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result =0;
		/*String sql = "update tb_board set hit = (select hit from tb_board where boardnum = ?) +1" 
					+ "where boardnum = ?";*/
		String sql = "update tb_board set hit = hit+1 where boardnum = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1,boardnum);
			//ptmt.setInt(2,boardnum);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
	
	}
	

}
