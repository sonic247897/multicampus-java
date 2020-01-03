package workbook2;

public class Rectangle extends Shape implements Movable{
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int x, int y) {
		// point는 상속관계가 아니므로 한번은 new를 해서 객체를 생성해줘야 한다.
		super(new Point(x, y));
		this.width = width;
	}
	
	public String printInfo() {
		return (point.getX() + " " 
				+ point.getY() + " "
				+ width);
	}
	
	
	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
		
	}

	@Override
	public double getArea() {
		return width*width;
	}

	@Override
	public double getCircumference() {
		return 4*width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
