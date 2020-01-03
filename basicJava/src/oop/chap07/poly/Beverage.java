package oop.chap07.poly;

abstract public class Beverage {
	private String name;
	protected int price;
	// 기본생성자가 spec에 없더라도 만든다
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
		System.out.println(name+" 이며, 가격은 "+price);
	}
}
