package model;

/**
 * This class helps handling and calculating products and prices,
 * if there are multiple products of the same type.
 */
public class OrderLine {
	private int quantity;
	private double subtotal;
	private Product product;
	
	/**
	 * Constructor - creates a new OrderLine object with the below parameters:
	 * @param product
	 * @param quantity
	 */
	public OrderLine(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.subtotal = product.getPrice() * quantity;
	}

	/**
	 * Accessor that returns the value of quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Mutator that sets the value of quantity
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Accessor that returns the value of subtotal
	 * @return subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}

	/**
	 * Mutator that sets the value of subtotal
	 * @param subtotal
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * Accessor that returns the value of product
	 * @return
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Mutator that sets the value of product
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
