package model;

public class OrderLine {
	private int quantity;
	private double subtotal;
	private Product product;
	
	public OrderLine(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.subtotal = product.getPrice() * quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
