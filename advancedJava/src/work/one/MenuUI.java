package work.one;
import java.sql.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	
	public void insertMenu(){
		// �Ի����� ���ó�¥ - sysdate, point = 1000�� ���Եǵ���
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		int pass = key.nextInt();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO member = new CustomerDTO(id, pass, name, addr);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("���� ��� ����");
		}
		else {
			System.out.println("���� ��� ����");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******��������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		
	}
	public void deleteMenu(){
		System.out.println("*******��������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
}

















