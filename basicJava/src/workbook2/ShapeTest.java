package workbook2;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[4];
		shape[0] = new Rectangle(4, 7, 5);
		shape[1] = new Rectangle(5, 4, 6);
		shape[2] = new Circle(6, 6, 7);
		shape[3] = new Circle(7, 8, 3);
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Rectangle) {
				System.out.print("Rectangle: "+((Rectangle)shape[i]).getWidth()+" ");
			}
			else {
				System.out.print("Circle: "+((Circle)shape[i]).getRadius() +" ");
			}
			System.out.println(shape[i].getPoint().getX()+ " " 
							+shape[i].getPoint().getY());
		}
		
		System.out.println("After Move .............");
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Rectangle) {
				((Rectangle)shape[i]).move(10, 10);
				System.out.print("Rectangle: "+((Rectangle)shape[i]).getWidth()+" ");
			}
			else {
				((Circle)shape[i]).move(10, 10);
				System.out.print("Circle: "+((Circle)shape[i]).getRadius() +" ");
			}
			System.out.println(shape[i].getPoint().getX()+ " " 
							+shape[i].getPoint().getY());
		}
		
	}

}
