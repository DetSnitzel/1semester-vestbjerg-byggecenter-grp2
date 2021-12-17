package controller;
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
}
