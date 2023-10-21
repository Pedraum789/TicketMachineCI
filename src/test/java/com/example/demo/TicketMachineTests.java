package com.example.demo;

import com.example.demo.ticketmachine.core.TicketMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketMachineTests {

	@Test
	void insertCorrectTest() throws main.java.com.demo.ticketmachine.exception.PapelMoedaInvalidaException {

		TicketMachine ticketMachine = new TicketMachine(10);
		ticketMachine.inserir(2);
		ticketMachine.inserir(2);
		assertEquals(4, ticketMachine.getSaldo());
	}

	@Test
	void insertNotCorrectTest() {

		TicketMachine ticketMachine = new TicketMachine(10);

		assertThrows(main.java.com.demo.ticketmachine.exception.PapelMoedaInvalidaException.class,
				() -> {
					ticketMachine.inserir(7);
				});
	}

}