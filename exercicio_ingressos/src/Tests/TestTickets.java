package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.FamilyTicket;
import model.HalfPrice;
import model.Ticket;

class TestTickets {
	
	Ticket t1 = new Ticket(25, "Dracula", false);
	Ticket t2 = new HalfPrice(25, "Dracula", false);
	Ticket t3 = new FamilyTicket(25, "Dracula", true, 3);
	Ticket t4 = new FamilyTicket(25, "Dracula", true, 4);
	
	@Test
	void testTicket() {
		assertEquals("Ingresso { Filme: Dracula, Valor: 25.0, Categoria: Legendado }", t1.toString());
	}
	
	@Test
	void testHalfPrice() {
		assertEquals("Meia Entrada { Filme: Dracula, Valor: 12.5, Categoria: Legendado }", t2.toString());
	}
	
	@Test
	void testFamilyPrice1() {
		assertEquals("Ingresso Família { Filme: Dracula, Quantidade: 3, Valor: 75.0, Categoria: Dublado }", t3.toString());
	}
	
	@Test
	void testFamilyPrice2() {
		assertEquals("Ingresso Família { Filme: Dracula, Quantidade: 4, Valor: 95.0, Categoria: Dublado }", t4.toString());
	}

}
