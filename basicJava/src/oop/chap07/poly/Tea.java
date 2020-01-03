package oop.chap07.poly;

public class Tea extends Beverage{
	static int amount;
	
	public Tea() {
		
	}
	public Tea(String name) { // Tea가 판매
		setName(name);
		++amount;
		calcPrice();
	}

	@Override
	public void calcPrice() {
		if(getName().equals("lemonTea")){
			price = 1500;
		}
		else if(getName().equals("ginsengTea")) {
			price = 2000;
		}
		else if(getName().equals("redginsengTea")) {
			price = 2500;
		}
		
	}
	// static 멤버를 엑세스하기 위해서 static메소드를 정의해서 액세스한다.
		public static int getAmount() {
			return amount;
		}
}
