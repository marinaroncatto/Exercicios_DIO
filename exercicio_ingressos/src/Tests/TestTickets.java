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
		assertEquals("Ingresso { Filme: Dracula, Valor: R$ 25.00, Categoria: Legendado }", t1.toString());
	}
	
	@Test
	void testHalfPrice() {
		assertEquals("Meia Entrada { Filme: Dracula, Valor: R$ 12.50, Categoria: Legendado }", t2.toString());
	}
	
	@Test
	void testFamilyPrice1() {
		assertEquals("Ingresso Família { Filme: Dracula, Quantidade: 3, Valor: R$ 75.00, Categoria: Dublado }", t3.toString());
	}
	
	@Test
	void testFamilyPrice2() {
		assertEquals("Ingresso Família { Filme: Dracula, Quantidade: 4, Valor: R$ 95.00, Categoria: Dublado }", t4.toString());
	}

}
