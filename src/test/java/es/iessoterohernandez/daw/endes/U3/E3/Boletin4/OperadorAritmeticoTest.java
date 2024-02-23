package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {


	@Test
	void testSuma() {
		OperadorAritmetico o= new OperadorAritmetico(); 
		assertEquals(5, o.suma(2, 3));
		assertEquals(-1, o.suma(-2, 1));
		assertEquals(0, o.suma(0, 0));
	}

	@Test
	void testDivision() {
		OperadorAritmetico o= new OperadorAritmetico(); 
		

		try {
			o.division(5, 0);
		} catch (Exception e) {
			assertTrue(e instanceof Exception);
		}
	}

}
