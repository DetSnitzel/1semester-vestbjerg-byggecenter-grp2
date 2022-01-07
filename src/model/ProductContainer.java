package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores the data from products after they are created.
 */
public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<Product> products;

	/**
	 * Constructor for the class that is private so we follow the Singleton pattern
	 */
	private ProductContainer() {
		products = new ArrayList<>();
	}

	/**
	 * Checks whether the Singleton container already contains an object,
	 * or if it is empty so that an object can be added.
	 * @return
	 */
	public static ProductContainer getInstance() {
		if (instance == null) {
			instance = new ProductContainer();
		}
		return instance;
	}

	/**
	 * Adds a product object to the Singleton container.
	 * @param product
	 */
	public void addProduct(Product product) {
		products.add(product);
	}

	/**
	 * Searches the ArrayList<Product> products for a product object
	 * matching the input of barcode. Returns the product if a match
	 * is available.
	 * @param barcode
	 * @return product
	 */
	public Product findProductByBarcode(String barcode) {
		Product product = null;
		boolean goon = true;
		int i = 0;
		while (goon && i < products.size()) {
			if (products.get(i).getBarcode().equals(barcode)) {
				product = products.get(i);
				goon = false;
			}
			i++;

		}
		return product;
	}

	public List<Product> findAll() {
		return new ArrayList<>(products);
	}

}
