package oop.chap07.poly;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		// 배열변수에 다형성 적용 (부모 타입으로 정의하고 각자 다른 자식 객체들 생성)
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
	}
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
	public static void getSalesInfo(Beverage[] b) {
		for(int i=0; i < b.length; ++i) {
			System.out.print(i+1 +" 번째 판매 음료는 ");
			b[i].print();
		}	
	}
	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
	public static int getTotalPrice(Beverage[] b) {
		int totalPrice=0;
		for(int i=0; i<b.length; ++i) {
			totalPrice += b[i].getPrice();
		}
		return totalPrice;
	}
}
