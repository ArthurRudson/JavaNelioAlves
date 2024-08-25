package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeList;

public class Program9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Emplyoee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			list
			.add(new EmployeeList(id, name, salario));
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int checkId = sc.nextInt();
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == checkId).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println("List of employees:");
		for(EmployeeList obj : list) {
			System.out.println(obj);
		}
		
	
		
		sc.close();
	}

}
