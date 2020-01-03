package workbook;

public class Company {
	private double salary; //�⺻��
	private double annualIncome; //���ҵ�
	private double afterTaxAnnualIncome; //���� ���� �� ���ҵ��� ��
	double bonus; //���ʽ�
	private double afterTaxBonus; // ���� ���� �� �� ���ʽ��� ��
	
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
