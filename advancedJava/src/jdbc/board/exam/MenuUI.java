package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	// �θ� Ÿ������ ����
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id,title,content);
		int result = dao.insert(board);
		// ���ó��
		if(result >0) {
			System.out.println("�Խñ۵�� ����");
		}else {
			System.out.println("�� ��� ����");
		}
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(boardNum, id);
		// ���ó��
		if(result >0) {
			System.out.println("������Ʈ ����");
		}else {
			System.out.println("������Ʈ ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(boardNum);
		// ���ó��
		if(result >0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		if(size ==0) {
			System.out.println("�Խñ��� �����ϴ�.");
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
	
	
	
	// 5. �������� �Խñ� �˻��ϱ� -L
	public void findByTitleMenu() {
		System.out.println("*******�Խñ� �������� �˻�********");
		System.out.print("�Խñ� ����: ");
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
	// 6. �Խñ� �󼼺��� -R
	public void readMenu() {
		System.out.println("*******�Խñ� �󼼺���********");
		System.out.print("�Խñ� ��ȣ: ");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		if(board== null) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		}else {
		dao.hitUpdate(boardnum);
		System.out.println("�۹�ȣ:"+board.getBoardNum());
		System.out.println("����:"+board.getTitle());
		System.out.println("�ۼ���:"+board.getId());
		System.out.println("�ۼ���¥:"+board.getWriteDate());
		System.out.println("��ȸ��:"+board.getHit());
		}
	}
	
}

















