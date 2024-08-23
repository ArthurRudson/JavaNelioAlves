package application;

import java.util.Scanner;

import entities.Bank;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Bank(accountNumber, name, initialDeposit);
		} else {
			account = new Bank(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraValue = sc.nextDouble();
		account.withdraw(withdraValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
