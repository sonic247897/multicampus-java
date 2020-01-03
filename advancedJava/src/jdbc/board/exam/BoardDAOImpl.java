package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//tb_board���̺��� �׼����ϴ� ����� ���ǵ� Ŭ����
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board) {
		System.out.println("dto���޼ҵ�:"+board); //toString ���
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0; //�޼ҵ� �������� ����� ����
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		
		try {
			con = DBUtil.getConnect(); //DBMS ����
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result; //���� ���� 0 ����
	}
	
	public int insert(String id, String title, String content) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0; //�޼ҵ� �������� ����� ����
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		
		try {
			con = DBUtil.getConnect(); //DBMS ����
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setString(1,id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result; //���� ���� 0 ����
	}
	
	public int update(int boardNum, String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result =0;
		String sql = "update tb_board set id = ? where boardnum =?";
		
		try {
			con = DBUtil.getConnect();
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setString(1,id);
			ptmt.setInt(2, boardNum);
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
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
			//1. PreparedStatement ����
			ptmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			ptmt.setInt(1, boardNum);
			//3. �����ϱ�
			// ������ sql�Ľ� �����Ƿ� �Ű����� x
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public ArrayList<BoardDTO> select() {
		// ��ü �Խñ��� ���� Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		// ��ȸ�� �Խñ��� ���� ��ü
		// ��ü�� �������� �ʰ� null�� �ʱ�ȭ�ϴ� ����
		// -> �����͸� ��ȸ�ϴ� �۾��� �ϴ� ���� while�� �����̹Ƿ�
		//	 while������ ��ü�� ����
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			// rs.next() �ѹ� �ϸ� ù��° ���ڵ�� �̵�
			while(rs.next()) {
				// 1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6));
				// 2. DTO�� ��ȯ�� ���ڵ带 ArrayList�� �߰�
				boardlist.add(board);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return boardlist;
	}

	// �Խñ� �б� - R
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

	//�Խñ� �������� �˻� - L
	@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		// !���� - ���� ��ġ�ϴ� �� ���� �����ϴ°͵� �����;� ��
		// ? �ѷ����� '' ������!
		// �Լ� �ȿ� ����ǥ ��°� ������
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
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace(); 
		}finally {
			DBUtil.close(null, ptmt, con);
		}
	
	}
	

}