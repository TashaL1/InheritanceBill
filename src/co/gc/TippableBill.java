package co.gc;
//Create another class named TippableBill.
//It inherits from Bill.
//It has an additional double field: tip
//Add a no-args constructor and another constructor with three parameters to set the fields.
//It overrides the calcTotal method to add the tip ( bill calculation total, then + tip ).

public class TippableBill extends Bill{
	
	private double tip;

	public TippableBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcTotal() {
		return super.calcTotal() + tip;
		
	}

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		this.tip = tip;
	}
	
}
