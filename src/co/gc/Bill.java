package co.gc;
//Create a class named Bill.
//It has two double fields: subtotal and taxRate
//Each field has a getter and setter
//Add a no-args constructor and another constructor with two parameters to set the fields.
//Add a method named calcTotal. It has no parameters. 
//It calculates and returns the total bill (subtotal * (1 + taxRate)).

public class Bill {

	private static double subtotal;
	private static double taxRate;
	
	public Bill(double subtotal, double taxRate) {
		super();
		this.subtotal = subtotal;
		this.taxRate = taxRate;
	}
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double calcTotal() {
		return (subtotal * (1 + taxRate));
		
	}
}
