package oop.chap07.poly;

abstract public class Beverage {
	private String name;
	protected int price;
	// �⺻�����ڰ� spec�� ������ �����
	public Beverage() {
		
	}

	public Beverage(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	abstract public void calcPrice();
	
	public void print() {
		System.out.println(name+" �̸�, ������ "+price);
	}
}
