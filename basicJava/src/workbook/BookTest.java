package workbook;

public class BookTest {
	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		for(int i=0; i<3; ++i) {
			bookArray[i] = new Book();
		}
		bookArray[0].setBookName("SQL Plus");
		bookArray[0].setBookPrice(50000);
		bookArray[0].setBookDiscountRate(5);
		
		bookArray[1].setBookName("Java 2.0");
		bookArray[1].setBookPrice(40000);
		bookArray[1].setBookDiscountRate(3);
		
		bookArray[2].setBookName("JSP Servlet");
		bookArray[2].setBookPrice(60000);
		bookArray[2].setBookDiscountRate(6);
		
		int sum=0;
		double discountSum=0;
		for(int i=0; i<3; ++i) {
			System.out.println(bookArray[i].getBookName() + "\t"
					+bookArray[i].getBookPrice()+ "원\t"
					+bookArray[i].getBookDiscountRate()+"%\t"
					+bookArray[i].getDiscountBookPrice() +"원");
			sum += bookArray[i].getBookPrice();
			discountSum += bookArray[i].getDiscountBookPrice();
		}
		System.out.println("책 가격의 합: " +sum+"원");
		System.out.println("할인된 책 가격의 합: "+discountSum+"원");
		
	}

}
