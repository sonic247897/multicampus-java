package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	// 부모 타입으로 정의
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		//여기에서 BoardDAO의 메소드를 호출하세요
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id,title,content);
		int result = dao.insert(board);
		// 결과처리
		if(result >0) {
			System.out.println("게시글등록 성공");
		}else {
			System.out.println("글 등록 실패");
		}
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.update(boardNum, id);
		// 결과처리
		if(result >0) {
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardNum = key.nextInt();
		//여기에서 BoardDAO의 메소드를 호출하세요
		int result = dao.delete(boardNum);
		// 결과처리
		if(result >0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******게시글조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		if(size ==0) {
			System.out.println("게시글이 없습니다.");
		}
		else {
			for(int i=0; i<size; ++i) {
				BoardDTO board = boardlist.get(i);
				System.out.println(board.getBoardNum()+"\t"+
						board.getTitle()+"\t"+board.getId()+"\t"
						+board.getHit());
			}
		}
	}
	
	
	
	// 5. 제목으로 게시글 검색하기 -L
	public void findByTitleMenu() {
		System.out.println("*******게시글 제목으로 검색********");
		System.out.print("게시글 제목: ");
		String title = key.next();
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		if(size ==0) {
			System.out.println();
		}
		for(int i =0; i<size ; ++i) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+
					board.getTitle()+"\t"+board.getId()+"\t"
					+board.getHit());
		}
	}
	// 6. 게시글 상세보기 -R
	public void readMenu() {
		System.out.println("*******게시글 상세보기********");
		System.out.print("게시글 번호: ");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		if(board== null) {
			System.out.println("조회된 데이터가 없습니다.");
		}else {
		dao.hitUpdate(boardnum);
		System.out.println("글번호:"+board.getBoardNum());
		System.out.println("제목:"+board.getTitle());
		System.out.println("작성자:"+board.getId());
		System.out.println("작성날짜:"+board.getWriteDate());
		System.out.println("조회수:"+board.getHit());
		}
	}
	
}


















