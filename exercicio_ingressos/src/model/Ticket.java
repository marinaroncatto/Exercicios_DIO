package model;

import java.util.Locale;

public sealed class Ticket permits HalfPrice, FamilyTicket{
	
	private double fullPrice;
	private String movieName;
	private boolean isDubbed;
		
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

	public String getIsDubbed() {
		if(this.isDubbed) {
			return "Dublado";
		}
		return "Legendado";
	}

	public void setDubbed(boolean isDubbed) {
		this.isDubbed = isDubbed;
	}


	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ingresso { ");
		sb.append("Filme: ").append(getMovieName()).append(", ");
		Locale.setDefault(Locale.US);
		sb.append("Valor: R$ ").append(String.format("%.2f", getFullPrice())).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}
	
	
	
	
}
