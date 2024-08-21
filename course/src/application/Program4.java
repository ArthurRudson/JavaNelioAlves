package application;

import java.util.Scanner;

import entities.Employee;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Nome: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.NetSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double por = sc.nextDouble();
		
		System.out.println("Updated data: " +  employee.name + ", $ " + employee.IncreaseSalary(por));
		
		sc.close();
	}

}
