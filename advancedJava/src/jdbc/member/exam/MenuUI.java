package jdbc.member.exam;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	
	public void insertMenu(){
		// �Ի����� ���ó�¥ - sysdate, point = 1000�� ���Եǵ���
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO member = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("�λ� ��� ����");
		}
		else {
			System.out.println("�λ� ��� ����");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******�������********");
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
		System.out.println("*******�������********");
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
	
	public void findByAddrMenu(){
		System.out.println("*******�ּҷ� ��� �˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		if(size == 0) {
			System.out.println("��ġ�ϴ� ����� �����ϴ�.");
		}
		else {
			for(int i=0; i<size ;++i) {
				MemberDTO member = memberlist.get(i);
				System.out.println(member.getId() + "\t"+
				member.getName()+"\t"+member.getAddr()+"\t"
				+member.getPoint()+"\t"+member.getHiredate());
			}
		}
	}
	
	// <<memberlist�� ó���� null�� �ʱ�ȭ ���� �ʾұ� ������ if(memberlist == null)
	// 	����� �� ���� memberlist�� size�� 0���� �� üũ�Ѵ�.>>
	// ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
	//MemberDTO member = null;
	
	public void selectMenu(){
		System.out.println("*******��ü �����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		if(size == 0) {
			System.out.println("����� �����ϴ�.");
		}
		else {
			for(int i=0; i<size ;++i) {
				MemberDTO member = memberlist.get(i);
				System.out.println(member.getId() + "\t"+
				member.getName()+"\t"+member.getAddr()+"\t"
				+member.getPoint()+"\t"+member.getHiredate());
			}
		}
	}
	
	public void loginMenu() {
		System.out.println("********�α���**********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("��й�ȣ:");
		String pass = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO member = dao.login(id, pass);
		if(member == null) {
			System.out.println("�α����� �����߽��ϴ�.");
		}
		else {
			System.out.println("�α����� �����߽��ϴ�.");
			System.out.println(member.getId() + "\t"+
			member.getName()+"\t"+member.getAddr()+"\t"
			+member.getPoint()+"\t"+member.getHiredate());
		}
		
	}
}

















