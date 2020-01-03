package workbook2;

public class Circle extends Shape implements Movable{
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}

	
	public String printInfo() {
		return (point.getX() + " " 
					+ point.getY() + " "
					+ radius);
	}
	

	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+y+1);
	}

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double getCircumference() {
		return radius*2*Math.PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
}
