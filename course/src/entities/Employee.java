package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return this.GrossSalary - this.Tax;
	}
	
	public double IncreaseSalary(double percentage) {
		 return GrossSalary += GrossSalary * percentage / 100.0;
	}
	
}
