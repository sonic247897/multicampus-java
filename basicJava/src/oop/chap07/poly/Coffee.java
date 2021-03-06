package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount;
	
	public Coffee() {
		
	}
	
	public Coffee(String name) {
		setName(name);
		++amount;
		calcPrice();
	}

	
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")){
			price = 1500;
		}
		else if(getName().equals("CafeLatte")) {
			price = 2500;
		}
		else if(getName().equals("Cappuccino")) {
			price = 3000;
		}
	}
	// static 멤버를 엑세스하기 위해서 static메소드를 정의해서 액세스한다.
	public static int getAmount() {
		return amount;
	}
}
