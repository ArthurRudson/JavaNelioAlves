package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProductExercicio; 
import entities.ProductExercicioPolimorfismo;
import entities.UsedProductExercicio;

public class ProgramExercicioPolimorfismo {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<ProductExercicioPolimorfismo> list = new ArrayList<>();
		
		System.out.print("Enter the number of products ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" +i+ " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char p = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (p == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProductExercicio(name, price, customsFee));
			} else if (p == 'u') {
				System.out.print("Manufacture data (DD/MM/YYYY): ");
				LocalDate  manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProductExercicio(name, price, manufactureDate));
			} else {
				list.add(new ProductExercicioPolimorfismo(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(ProductExercicioPolimorfismo prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
