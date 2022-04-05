package entities;

public class ImportedProduct extends Product  {
	private Double customFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String nome, double price, Double customFee) {
		super(nome, price);
		this.customFee = customFee;
	}

	public double totalPrice() {
		return super.getPrice()+customFee;
	}

	@Override
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)", super.getNome(), totalPrice(), this.customFee);
	}
}
