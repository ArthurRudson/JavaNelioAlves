package application;

import java.util.ArrayList;
import java.util.List;

import entitiess.Product;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		//quarto exemplo
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		
		
		list.removeIf(p -> p.getPrice() >= min);
		
		//list.removeIf(Product::nonStaticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
