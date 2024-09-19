package util;

import java.util.function.Predicate;

import entitiess.Product;

//primeiro exemplo
public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

	
	
}
