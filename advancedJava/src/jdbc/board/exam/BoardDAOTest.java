package jdbc.board.exam;

import java.util.Scanner;

public class BoardDAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);	
		BoardDAOImpl dao = new BoardDAOImpl();
		/*System.out.println("************게시글 등록************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		System.out.println();
		dao.insert(id, title, content);*/
		
		/*System.out.print("번호:");
		int boardNum = key.nextInt();
		dao.delete(boardNum);*/
		
		/*System.out.print("번호:");
		int boardNum = key.nextInt();
		System.out.print("아이디:");
		String id = key.next();
		dao.update(boardNum, id);*/
		
		dao.select();
		
		
	}
}
