package model;

public class HalfPrice extends Ticket{
	
	public HalfPrice(double price, String movieName, boolean isDubbed) {
		super(price, movieName, isDubbed);
	}

	public double getHalfPrice() {
		return super.fullPrice / 2;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meia Entrada { ");
		sb.append("Filme: ").append(getMovieName()).append(", ");
		sb.append("Valor: ").append(getHalfPrice()).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}
	
	

	
}
