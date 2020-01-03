package workbook;

import org.w3c.dom.css.Rect;

public class ShapeTest {
	public static void main(String[] args) {
		// Shape Ÿ���� ��ü�� ������ �� �ִ� ���� 6���� �迭�� ����
		Shape shape[] = new Shape[7];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		shape[6] = new Circle(0,0,"White",5);
		
		System.out.println("�⺻����");
		for(int i=0; i<shape.length; ++i) {
			if(shape[i] instanceof Triangle) {
				System.out.print("Triangle\t");
			}
			else if(shape[i] instanceof Rectangle){
				System.out.print("Rectangle\t");
			}
			else {
				System.out.print("Circle\t");
			}
			System.out.println(shape[i].getArea() +"\t" 
							+ shape[i].getColors());
			
		}
		
		System.out.println();
		System.out.println("����� ���� �� ����");
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				((Triangle)shape[i]).setResize(5);
				System.out.print("Triangle\t");
			}
			else if(shape[i] instanceof Rectangle){
				((Rectangle)shape[i]).setResize(5);
				System.out.print("Rectangle\t");
			} 
			else {
				((Circle)shape[i]).setResize(5);
				System.out.print("Circle\t");
			} 
			System.out.println(shape[i].getArea() +"\t" 
					+ shape[i].getColors());
		}
		
		System.out.println();
		// ���� for�� - 5.0���� �߰��� for��
		// �迭�̳� collection�� �ٷ� �� ���
		// for���� �� �� ����� ������
		// shape �迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		/*for (Shape obj : shape) {
			// obj = shape[i]
			// ��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
			// ��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�.
			if(obj instanceof Rectangle) {
				((Rectangle)obj).setResize(5);
				System.out.print("Rectangle\t");
			}
			else if(obj instanceof Triangle) {
				((Triangle)obj).setResize(5);
				System.out.print("Triangle\t");

			}
			System.out.println(obj.getArea() +"\t" 
					+ obj.getColors());
		}*/
		
	}

}
