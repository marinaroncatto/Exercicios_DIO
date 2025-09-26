package model;

public class HalfPrice extends Ticket{

	public HalfPrice() {
		super();		
	}
	
	public double getHalfPrice() {
		return super.fullPrice / 2;
	}

	
}
