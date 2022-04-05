package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Product;
import entities.UsedProduct;

public class ProgramaTeste {

	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Date dia = sdf.parse("06/08/2018");
		 System.out.println(sdf.format(dia));
		Product product = new UsedProduct("Iphone", 400.00,dia );
		System.out.println(product.priceTag());
	}

}
