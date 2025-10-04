package model;

import java.util.Locale;

public final class FamilyTicket extends Ticket{
	
	private int howMany;
	
	public FamilyTicket(double price, String movieName, boolean isDubbed, int howMany) {
		super(price, movieName, isDubbed);
		this.howMany = howMany;
	}

	public int getHowMany() {
		return howMany;
	}

	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}
	
	public double getFamilyTicketPrice() {
		double total = totalPrice();
		
		if(howMany > 3) {
			return total *= 0.95;
		}
		
		return total;

	}
	
	private double totalPrice() {
		return getFullPrice() * getHowMany();
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ingresso Família { ");
		sb.append("Filme: ").append(getMovieName()).append(", ");
		sb.append("Quantidade: ").append(getHowMany()).append(", ");
		Locale.setDefault(Locale.US);
		sb.append("Valor: R$ ").append(String.format("%.2f", getFamilyTicketPrice())).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}

	
	
	
}
