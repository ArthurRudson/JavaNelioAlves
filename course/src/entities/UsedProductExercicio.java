package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProductExercicio extends ProductExercicioPolimorfismo{

	private LocalDate manufactureDate;
	
	public UsedProductExercicio() {
		
	}

	public UsedProductExercicio(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + "(used) $ " + getPrice() + "(Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
