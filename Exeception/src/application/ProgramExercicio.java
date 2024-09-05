package application;

import java.util.Scanner;

import model.entities.AccountExercicio;
import model.exceptins.DomainException;

public class ProgramExercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int n = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			AccountExercicio account = new AccountExercicio(n, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			
			System.out.print("New balance: " + account.getBalance()); 
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
