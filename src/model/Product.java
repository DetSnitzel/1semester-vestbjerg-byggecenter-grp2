package model;
import java.util.ArrayList;

/**
 * This class creates and handles product objects
 */
public class Product {
	private String name;
	private String barcode;
	private double price;
	private ArrayList<Copy> copies;	
	
	/**
	 * Constructor - creates a new Product object with the below parameters:
	 * @param name
	 * @param barcode
	 * @param price
	 */
	public Product(String name, String barcode, double price) {
		super();
		this.name = name;
		this.barcode = barcode;
		this.price = price;
	}
	
	/**
	 * Accessor that returns the value of name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Mutator that sets the value of name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Accessor that returns the value of barcode
	 * @return barcode
	 */
	public String getBarcode() {
		return barcode;
	}
	
	/**
	 * Mutator that sets the value of barcode
	 * 
	 * @param barcode
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	/**
	 * Accessor that returns the value of price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Mutator that sets the value of price
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Accessor that returns the ArrayList<Copy> of copies
	 * @return copies
	 */
	public ArrayList<Copy> getCopies() {
		return copies;
	}
	
	/**
	 * Mutator that sets the value of copies in ArrayList<Copy>
	 * 
	 * @param copies
	 */
	public void setCopies(ArrayList<Copy> copies) {
		this.copies = copies;
	}
	
	/**
	 * Adds a Copy object of a product to the ArrayList<Copy> copies.
	 * @param c
	 */
	public void addCopy(Copy c) {
		copies.add(c);
	}
	
}
