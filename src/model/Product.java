package model;
import java.util.ArrayList;

public class Product {
	private String name;
	private String barcode;
	private double price;
	private ArrayList<Copy> copies;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArrayList<Copy> getCopies() {
		return copies;
	}
	public void setCopies(ArrayList<Copy> copies) {
		this.copies = copies;
	}
	
//	public ArrayList<Copy> getListCopy(){
//		return copies;
//	}
	
	public void addCopy(Copy c) {
		copies.add(c);
	}
	
}
