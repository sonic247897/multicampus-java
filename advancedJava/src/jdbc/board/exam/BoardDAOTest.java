package jdbc.board.exam;

import java.util.Scanner;

public class BoardDAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);	
		BoardDAOImpl dao = new BoardDAOImpl();
		/*System.out.println("************�Խñ� ���************");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		System.out.println();
		dao.insert(id, title, content);*/
		
		/*System.out.print("��ȣ:");
		int boardNum = key.nextInt();
		dao.delete(boardNum);*/
		
		/*System.out.print("��ȣ:");
		int boardNum = key.nextInt();
		System.out.print("���̵�:");
		String id = key.next();
		dao.update(boardNum, id);*/
		
		dao.select();
		
		
	}
}
