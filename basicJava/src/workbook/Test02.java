package workbook;

public class Test02 {
	public static void main(String[] args) {
		// Company의 salary가 double이고 입력받은 salary가 int이므로
		// 자동 casting이 된다.
		Company c = new Company(Integer.parseInt(args[0]));
		System.out.print("연 기본급 합: " + c.getIncome() + " "
				+ "세후: " +c.getAfterTaxIncome());
		System.out.println();
		System.out.println("연 보너스 합: " +c.getBonus() + " "
				+ "세후: "+c.getAfterTaxBonus());
		System.out.println();
		double ans = c.getAfterTaxBonus()+c.getAfterTaxIncome();
		System.out.println("연 지급액 합: " +ans);
	}
}
