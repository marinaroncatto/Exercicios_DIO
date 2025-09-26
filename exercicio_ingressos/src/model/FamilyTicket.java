package model;

public class FamilyTicket extends Ticket{
	
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
		if(howMany <= 3) {
			return totalPrice();
		}
		
		return totalPrice() - (totalPrice() * 0.05);

	}
	
	private double totalPrice() {
		return super.fullPrice * this.howMany;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ingresso Família { ");
		sb.append("Filme: ").append(getMovieName()).append(", ");
		sb.append("Quantidade: ").append(getHowMany()).append(", ");
		sb.append("Valor: ").append(getFamilyTicketPrice()).append(", ");
		sb.append("Categoria: ").append(getIsDubbed()).append("");
		sb.append(" }");
		
		return sb.toString();
	}

	
	
	
}
