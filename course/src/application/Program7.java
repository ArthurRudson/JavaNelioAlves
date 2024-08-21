package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPricee = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amountt = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais =  %.2f%n ", CurrencyConverter.dollarToReal(amountt, dollarPricee));
		
		sc.close();
	}

}
