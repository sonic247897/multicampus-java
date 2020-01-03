package oop.chap07.poly;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		// �迭������ ������ ���� (�θ� Ÿ������ �����ϰ� ���� �ٸ� �ڽ� ��ü�� ����)
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+Coffee.amount+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+Tea.amount+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���
	public static void getSalesInfo(Beverage[] b) {
		for(int i=0; i < b.length; ++i) {
			System.out.print(i+1 +" ��° �Ǹ� ����� ");
			b[i].print();
		}	
	}
	//����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
	public static int getTotalPrice(Beverage[] b) {
		int totalPrice=0;
		for(int i=0; i<b.length; ++i) {
			totalPrice += b[i].getPrice();
		}
		return totalPrice;
	}
}
