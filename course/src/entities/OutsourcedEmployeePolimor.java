package entities;

public class OutsourcedEmployeePolimor extends EmployeePolimorfismo {
	
	private Double additinalCharge;

	public OutsourcedEmployeePolimor() {
		super();
	}
	
	public OutsourcedEmployeePolimor(String name, Integer hours, Double valuePerHour, Double additinalCharge) {
		super(name, hours, valuePerHour);
		this.additinalCharge = additinalCharge;
	}

	public Double getAdditinalCharge() {
		return additinalCharge;
	}

	public void setAdditinalCharge(Double additinalCharge) {
		this.additinalCharge = additinalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additinalCharge * 1.1;
 	}

}
