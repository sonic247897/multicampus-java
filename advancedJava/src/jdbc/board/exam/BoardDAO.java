package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	// �Խñ� ��� - C
	int insert(BoardDTO board); //�Ѳ����� �޾Ƽ� �۾�(���ڵ� ��ü�� ��Ƽ� �Ѱ���)
	// �Խñ� ���
	int insert(String id, String title, String content);
	int update(int boardNum, String id); //�Խñ� ���� - U
	int delete(int boardNum); //�Խñ� ���� - D
	
	// **select�� where�� ���� �ΰ� ����(L=>��Ȯ�ϰ� ��ġ���� �ʾƵ� ��,R=>primary key)
	// ?�� column ��ü �Ұ���, ���� ��ü ����
	ArrayList<BoardDTO> select(); //��ü �Խñ� ��ȸ - L(list)
			// BoardDTO �ΰ��̻� ���� �� ����
	BoardDTO read(int boardnum);// �Խñ� ��ȸ - R(read)
			// primary key�� �Ѱ� or 0�� �ҷ��� -> BoardDTO �Ѱ��� ����
	// �Խñ� �˻� - L
	ArrayList<BoardDTO> findByTitle(String title);
	void hitUpdate(int boardnum);
	
}