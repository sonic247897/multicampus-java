package workbook;

public class Company {
	private double salary; //기본급
	private double annualIncome; //연소득
	private double afterTaxAnnualIncome; //세금 공제 후 연소득의 합
	double bonus; //보너스
	private double afterTaxBonus; // 세금 공제 후 연 보너스의 합
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		this.annualIncome = this.salary*12;
		return annualIncome;
	}
	public double getAfterTaxIncome() {
		this.afterTaxAnnualIncome = getIncome()*(0.9);
		return this.afterTaxAnnualIncome;
	}
	public double getBonus() {
		this.bonus = getIncome()*(0.2)*4;
		return this.bonus;
	}
	public double getAfterTaxBonus() {
		this.afterTaxBonus = getBonus()*(1-0.055);
		return this.afterTaxBonus;
	}
	
}
