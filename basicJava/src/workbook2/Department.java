package workbook2;

public class Department {
	private String name;
	private Evaluation evaluation;
	
	public Department() {
		
	}

	public Department(String name, double evaluationA,
			double evaluationB,double evaluationC,double evaluationD,
			double evaluationE) {
		this.evaluation = new Evaluation(evaluationA, evaluationB, 
				evaluationC, evaluationD, evaluationE);
		this.name = name;
	}
	
	public double evaluationNumber() {
		return evaluation.evaluationNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
