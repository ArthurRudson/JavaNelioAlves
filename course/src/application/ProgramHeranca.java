package application;

import entities.AccoutHeranca;
import entities.BusibessAccountHeranca;
import entities.SavingsAccountUpEndDownCasting;

public class ProgramHeranca {

	public static void main(String[] args) {
		
		/*
		
		AccoutHeranca acc = new AccoutHeranca(1001, "Alex", 0.0);
		BusibessAccountHeranca bacc = new BusibessAccountHeranca(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING 
		
		AccoutHeranca acc1 = bacc;
		AccoutHeranca acc2 = new BusibessAccountHeranca(1003, "Bob", 0.0, 200.0);
		AccoutHeranca acc3 = new SavingsAccountUpEndDownCasting(1004, "ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusibessAccountHeranca acc4 = (BusibessAccountHeranca)acc2;
		acc4.loan(100.0);
		
		
		// BusibessAccountHeranca acc5 = (BusibessAccountHeranca)acc3;
		if (acc3 instanceof BusibessAccountHeranca) {
			BusibessAccountHeranca acc5 = (BusibessAccountHeranca)acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!");
		}
		if (acc3 instanceof SavingsAccountUpEndDownCasting) {
			SavingsAccountUpEndDownCasting acc5 = (SavingsAccountUpEndDownCasting)acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!");
		}
		*/
		
		/*
		AccoutHeranca acc1 = new AccoutHeranca(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		AccoutHeranca acc2 = new SavingsAccountUpEndDownCasting(1002, "maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());	
		
		AccoutHeranca acc3 = new BusibessAccountHeranca(1003, "bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		*/
		
		//AccoutHeranca x = new AccoutHeranca(1020, "alex", 1000.0);
		AccoutHeranca y = new SavingsAccountUpEndDownCasting(1023, "maria", 1000.0, 0.01);
		
		// x.withdraw(50.0);
		y.withdraw(50.0);
		
		// System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
