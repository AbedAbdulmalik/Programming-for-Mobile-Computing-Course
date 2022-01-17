package model;

public class VendingMachine {
	private String Coke;
	private String Juice;
	private String Kitkat;
	private String Lays;
	private String status;
	private int cokeStock;
	private int juiceStock;
	private int kitkatStock;
	private int laysStock;

	public VendingMachine () { 
		  Coke = "Coke";
		  Juice = "Orange Juice";
		  Kitkat = "Kitkat Chunky Bar";
		  Lays = "Lay's Classic Chips";
		  cokeStock = 0;
		  juiceStock = 0;
		  kitkatStock = 0;
		  laysStock = 0;
		  status = "";
		  
	}
	
	public String checkStatus() {
		String result = status; 
		if(result == "") {
			result = "Empty VM Started";
		}
		
		
		return result;
		}
	
	public String checkStock(String check) {
		String result = ""; 
		
		if (check == "Coke") {
			result = Coke + " " + "(" + cokeStock + ")";
		}
		
		else if (check == "Orange Juice") {
			result = Juice + " " + "(" + juiceStock + ")";
		}
		else if (check == "Kitkat Chunky Bar") {
			result = Kitkat + " " + "(" + kitkatStock + ")";
		}
		else if (check == "Lay's Classic Chips") {
			result = Lays + " " + "(" + laysStock + ")";
		}
		else {
			result = "Invalid product: " + check;
		}
		
		return result;
		}
	
	public String checkStock() {
		String result = "Stock: " + Coke + " (" + cokeStock + "), " + Juice + " (" + juiceStock + "), " + Kitkat + " (" + kitkatStock + "), " + Lays + " (" + laysStock + ")"; 
		return result;
		}
	
	public void add(String value, int number){
		if (value == "Coke") {
			cokeStock = cokeStock + number;
			status = "Product added: Coke (" + number +")";
		}
		else if (value == "Orange Juice") {
			juiceStock +=  number;
			status = "Product added: Orange Juice (" + number +")";
		}
		else if (value == "Kitkat Chunky Bar") {
			kitkatStock +=  number;
			status = "Product added: Kitkat Chunky Bar (" + number +")";
		}
		else if (value == "Lay's Classic Chips") {
			laysStock +=  number;
			status = "Product added: Lay's Classic Chips (" + number +")";
		}
		else {
			status = "Invalid product: " + value;
		}
	}
	public void dispense(String value, int number){
		if (value == "Coke") {
			cokeStock = cokeStock - number;
			status = "Product removed: Coke (" + number +")";
		}
		else if (value == "Orange Juice") {
			juiceStock = juiceStock - number;
			status = "Product removed: Orange Juice (" + number +")";
		}
		else if (value == "Kitkat Chunky Bar") {
			kitkatStock = kitkatStock - number;
			status = "Product removed: Kitkat Chunky Bar (" + number +")";
		}
		else if (value == "Lay's Classic Chips") {
			laysStock = laysStock - number;
			status = "Product removed: Lay's Classic Chips (" + number +")";
		}
		else {
			status = "Invalid product: " + value;
		}
	}
	

}
