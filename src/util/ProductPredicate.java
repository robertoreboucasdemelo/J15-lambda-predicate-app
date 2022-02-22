package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	// Modo 01 - Implementa��o via Interface
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}

}
