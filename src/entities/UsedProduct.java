package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String nome, double price, Date manufactureDate) {
		super(nome, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return String.format("%s (used) $ %.2f (Manufacture date: ", super.getNome(), super.getPrice())+sdf.format(manufactureDate)+")";
	}

}
