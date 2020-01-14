package jdbc.dept.exam;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******인사관리시스템******");
		System.out.println("1. 부서등록");
		System.out.println("2. 부서정보조회");
		System.out.println("3. 부서정보수정");
		System.out.println("4. 부서삭제");
		System.out.println("5. 모든 부서목록 확인하기");
		System.out.println("6. 부서별 사원 목록 확인");
		System.out.println("원하는 작업을 선택하세요:");
		int choice = key.nextInt();
		show(choice);
		}

	public static void show(int choice) {
		switch(choice) {
			case 1: 
				MenuUI.insertMenu();
				break;
			case 2:
				MenuUI.getDeptInfoMenu();
				break;
			case 3:
				MenuUI.updateMenu();
				break;
			case 4:
				MenuUI.deleteMenu();
				break;
			case 5:
				MenuUI.getDeptInfoMenu();
				break;
			case 6:
				MenuUI.getMemberListMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
	}

	
}
