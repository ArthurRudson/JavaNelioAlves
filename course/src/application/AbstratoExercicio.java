package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class AbstratoExercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax payer #" +i+ " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, income, health));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (TaxPayer tax : list) {
			System.out.println(tax.getNome() + " $ " + tax.tax());
			sum += tax.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " +  sum);

		sc.close();
	}

}
