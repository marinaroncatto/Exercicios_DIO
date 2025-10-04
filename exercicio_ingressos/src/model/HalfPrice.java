package model;

import java.util.Locale;

public final class HalfPrice extends Ticket{
	
	public HalfPrice(double price, String movieName, boolean isDubbed) {
		super(price, movieName, isDubbed);
	}

	public double getHalfPrice() {
		return getFullPrice() / 2;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meia Entrada { ");
		sb.append("Filme: ").append(getMovieName()).append(", ");
		Locale.setDefault(Locale.US);
		sb.append("Valor: R$ ").append(String.format("%.2f", getHalfPrice())).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}
	
	

	
}
