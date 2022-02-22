package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		// Modo 01 - Implementação via Interface
		list.removeIf(new ProductPredicate());
		
		// Modo 02 - Reference Method com Metodo Estatico
		list.removeIf(Product:: staticProductPredicate);

		// Modo 03 - Reference Method com Metodo Não Estatico
		list.removeIf(Product:: noStaticProductPredicate);
		
		// Modo 04 - Expressão Lambda Declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		// Modo 05 - Expressão Lambda Inline
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
