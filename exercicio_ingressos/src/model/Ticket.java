package model;

public class Ticket {
	
	protected double fullPrice;
	protected String movieName;
	protected boolean isDubbed;
	
	public Ticket() {
		
	}
		
	public Ticket(double price, String movieName, boolean isDubbed) {		
		this.fullPrice = price;
		this.movieName = movieName;
		this.isDubbed = isDubbed;
	}

	public double getFullPrice() {
		return fullPrice;
	}

	public void setFullPrice(double price) {
		this.fullPrice = price;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public boolean isDubbed() {
		return isDubbed;
	}

	public void setDubbed(boolean isDubbed) {
		this.isDubbed = isDubbed;
	}		
	
}
