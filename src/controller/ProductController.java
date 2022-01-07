package controller;
import java.util.List;

import model.Product;
import model.ProductContainer;

public class ProductController {
	private ProductContainer productContainer;
	
	
	
	public Product findProductByBarcode(String barcode) {
		Product product = null;
		ProductContainer pc = ProductContainer.getInstance();
		product = pc.findProductByBarcode(barcode);
		return product;
	}



	public List<Product> findAll() {
		return ProductContainer.getInstance().findAll();
	}
}
