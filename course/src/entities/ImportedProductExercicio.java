package entities;

public class ImportedProductExercicio extends ProductExercicioPolimorfismo {

	private Double costomsFee;
	
	public ImportedProductExercicio() {
		
	}

	public ImportedProductExercicio(String name, Double price, Double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}
	
	public Double getCostomsFee() {
		return costomsFee;
	}

	public void setCostomsFee(Double costomsFee) {
		this.costomsFee = costomsFee;
	}
	
	public Double totalPrice() {
		 return getCostomsFee() + getPrice();
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + " (Customs fee: $" + getCostomsFee() + ")";
	}
	
	
}
