package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	// 게시글 등록 - C
	int insert(BoardDTO board); //한꺼번에 받아서 작업(레코드 전체를 담아서 넘겨줌)
	// 게시글 등록
	int insert(String id, String title, String content);
	int update(int boardNum, String id); //게시글 수정 - U
	int delete(int boardNum); //게시글 삭제 - D
	
	// **select의 where에 따른 두개 유형(L=>정확하게 일치하지 않아도 됨,R=>primary key)
	// ?는 column 대체 불가능, 값만 대체 가능
	ArrayList<BoardDTO> select(); //전체 게시글 조회 - L(list)
			// BoardDTO 두개이상 나올 수 있음
	BoardDTO read(int boardnum);// 게시글 조회 - R(read)
			// primary key로 한개 or 0개 불러옴 -> BoardDTO 한개만 리턴
	// 게시글 검색 - L
	ArrayList<BoardDTO> findByTitle(String title);
	void hitUpdate(int boardnum);
	
}
