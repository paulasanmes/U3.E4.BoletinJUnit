package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	private Subscripcion s;

	@BeforeEach
	void init() {
		s = new Subscripcion(2, 2);
	}

	@AfterEach
	void finish() {
		s = null;
	}

	@Test
	void precioPositivoTest() {
		assertEquals(s.precioPorMes(), 1);
	}

	@Test
	void precioNegativoTest() {
		s = new Subscripcion(-2, 2);
		assertEquals(s.precioPorMes(), 0);
	}

	@Test
	void precioDoubleTest() {
		s = new Subscripcion(1, 2);
		assertTrue(s.precioPorMes() > 0);
	}

	@Test
	void cancelaSubs() {
		s.cancel();
		assertEquals(s.precioPorMes(), 0);
	}

	

}
