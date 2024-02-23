package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	private Pila pila;

	@BeforeEach
	void setUp() {
		pila = new Pila();
	}

	@AfterEach
	void tearDown() {
		pila = null;
	}

	@Test
	void testPush() {
		pila.push(5);
		assertFalse(pila.isEmpty());
		assertEquals(5, pila.top());

	}

	@Test
	void testPushEmpty() {
		pila.push(1);
		assertTrue(pila.isEmpty());

		pila.push(40);
		assertTrue(pila.isEmpty());
	}

	@Test
	void testPop() {
		assertNull(pila.pop());

		pila.push(10);
		assertEquals(10, pila.pop());
		assertTrue(pila.isEmpty());
	}

	@Test
	void testIsEmpty() {
		assertTrue(pila.isEmpty());

		pila.push(8);
		assertFalse(pila.isEmpty());
	}

	@Test
	void testTop() {
		assertNull(pila.top());

		pila.push(15);
		assertEquals(15, pila.top());
		assertFalse(pila.isEmpty());
	}

}
