package work.one;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	
	public void insertMenu(){
		// 입사일은 오늘날짜 - sysdate, point = 1000가 삽입되도록
		System.out.println("*******고객등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		int pass = key.nextInt();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		CustomerDTO member = new CustomerDTO(id, pass, name, addr);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("고객 등록 성공");
		}
		else {
			System.out.println("고객 등록 실패");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******고객수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
	}
	public void deleteMenu(){
		System.out.println("*******고객삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
}


















