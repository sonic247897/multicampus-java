package workbook;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public double getDiscountBookPrice() {
		double result = this.bookPrice*(1-this.bookDiscountRate/100);
		return result;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
}
