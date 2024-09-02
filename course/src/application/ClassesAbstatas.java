package application;

import java.util.ArrayList;
import java.util.List;

import entities.AccoutHeranca;
import entities.BusibessAccountHeranca;
import entities.SavingsAccountUpEndDownCasting;

public class ClassesAbstatas {

	public static void main(String[] args) {
		
		List<AccoutHeranca> list = new ArrayList<>();
		
		list.add(new SavingsAccountUpEndDownCasting(1001, "Arthur", 5000.0, 0.01));
		list.add(new BusibessAccountHeranca(1002, "maria", 1000.0, 400.0));
		list.add(new SavingsAccountUpEndDownCasting(1004, "Bob", 300.0, 0.01));
		list.add(new BusibessAccountHeranca(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for (AccoutHeranca acc : list) {
			sum += acc.getBalance();  
		}
		 
		System.out.println(sum);
		
		for (AccoutHeranca acc : list) {
			acc.deposit(10.0);
		}

		for(AccoutHeranca acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
		}
	}

}
