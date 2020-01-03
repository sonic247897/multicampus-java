package oop.chap07.poly;

public class Tea extends Beverage{
	static int amount;
	
	public Tea() {
		
	}
	public Tea(String name) { // Tea�� �Ǹ�
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
	// static ����� �������ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �׼����Ѵ�.
		public static int getAmount() {
			return amount;
		}
}
