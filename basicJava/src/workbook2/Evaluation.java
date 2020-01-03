package workbook2;

public class Evaluation {
	private double evaluationA;
	private double evaluationB;
	private double evaluationC;
	private double evaluationD;
	private double evaluationE;
	
	public Evaluation() {
		
	}

	public Evaluation(double evaluationA, double evaluationB, double evaluationC, double evaluationD,
			double evaluationE) {
		super();
		this.evaluationA = evaluationA;
		this.evaluationB = evaluationB;
		this.evaluationC = evaluationC;
		this.evaluationD = evaluationD;
		this.evaluationE = evaluationE;
	}
	
	public double evaluationNumber() {
		double result = (55/100.0)*((evaluationA+evaluationB)/2) 
		+ (25/100.0)*((evaluationC+evaluationD)/2)
		+ (20/100.0)*evaluationE;
		return result;
	}
	
	
}
