package appliction;

import java.util.ArrayList;
import java.util.List;

import entitiess.Product;
import model.services.ProductService;

public class FunctionComoParametro {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list,  p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " +  String.format("%.2f", sum));

	}

}
