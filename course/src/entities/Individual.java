package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String nome, Double anualIncome, Double healthExpenditures) {
		super(nome, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		if(getAnualIncome() < 20000.00) {
			if(getHealthExpenditures() != 0) {
				double tax = getAnualIncome() * 15 / 100;
				double desconto = tax - (getHealthExpenditures() * 50 / 100);
				return desconto;
 			} else {
 				return  getAnualIncome() * 15 / 100;
 			}
		} else {
			if(getHealthExpenditures() != 0) {
				double tax = getAnualIncome() * 25 / 100;
				double desconto = tax - (getHealthExpenditures() * 50 / 100);
				return desconto;
 			} else {
 				return  getAnualIncome() * 25 / 100;
 			}
		}
		
	}

}
