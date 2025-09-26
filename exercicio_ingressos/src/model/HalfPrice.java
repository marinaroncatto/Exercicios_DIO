package model;

public class HalfPrice extends Ticket{

	public HalfPrice(double price, String movieName, boolean isDubbed) {
		super(price, movieName, isDubbed);		
	}
	
	public double getHalfPrice() {
		return super.fullPrice / 2;
	}

	
}
