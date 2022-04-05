package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		String Sdia = "04/04/2022";

		Date dia = sdf.parse(Sdia);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		// Variáveis primitívas
		char tipo;
		String name;
		double price, customsFee;

		// Criando referencia Lista
		ArrayList<Product> products = new ArrayList<>();
		Product product = new Product();
		
		for (int i = 0+1; i <= n; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.printf("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			tipo = sc.nextLine().charAt(0);
			if (tipo == 'c') {

				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.printf("Price: ");
				price = sc.nextDouble();
				product = new Product(name, price);
				products.add(product);
			} else {
				if (tipo == 'u') {

					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.printf("Price: ");
					price = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					
					sc.nextLine();
					dia = sdf.parse(sc.nextLine());
					product = new UsedProduct(name, price, dia);
					products.add(product);
				} else {
					if (tipo == 'i') {

						System.out.print("Name: ");
						name = sc.nextLine();
						System.out.printf("Price: ");
						price = sc.nextDouble();
						System.out.print("Customs fee: ");
						customsFee = sc.nextDouble();
						product = new ImportedProduct(name, price, customsFee);
						products.add(product);
					} else {
						System.out.println("Valor Inválido!!!!!");
					}
				}
			}

		}
		
	System.out.println("\nPRICE TAGS: ");
	for (Product x : products) {
		System.out.println(x.priceTag());
	}
		sc.close();
	}
}
