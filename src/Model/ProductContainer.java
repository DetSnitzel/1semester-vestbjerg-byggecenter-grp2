package Model;

import java.util.ArrayList;

public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<Product> products;

	private ProductContainer() {
		products = new ArrayList<>();
	}

	public static ProductContainer getInstance() {
		if (instance == null) {
			instance = new ProductContainer();
		}
		return instance;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

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

}
