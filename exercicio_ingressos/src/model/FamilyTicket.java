package model;

public class FamilyTicket extends Ticket{
	
	private int howMany;
	
	public FamilyTicket(int howMany) {
		super();		
		this.howMany = howMany;
	}
	
	public double getFamilyTicketPrice() {
		if(howMany <= 3) {
			return totalPrice();
		}
		
		return totalPrice() - (totalPrice() * 0.05);

	}
	
	private double totalPrice() {
		return super.fullPrice * this.howMany;
	}
}
