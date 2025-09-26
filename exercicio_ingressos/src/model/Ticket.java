package model;

public class Ticket {
	
	protected double fullPrice;
	protected String movieName;
	protected boolean isDubbed;
		
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
		sb.append("Valor: ").append(getFullPrice()).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}
	
	
	
	
}
