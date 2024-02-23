package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {
	private Fridge fridge;

	@BeforeEach
	public void setUp() {
		fridge = new Fridge();
	}

	@AfterEach
	public void tearDown() {
		fridge = null;
	}

	@Test
	void testPut() {
		assertTrue(fridge.put("yogurt"));
		assertTrue(fridge.put("milk"));
		assertTrue(fridge.put("orange"));
		assertFalse(fridge.put("milk"));
	}

	@Test
	void testContains() {
		fridge.put("milk");
		assertTrue(fridge.contains("milk"));
		assertFalse(fridge.contains("banana"));
	}

	@Test
	public void testTake() throws NoSuchItemException {

		fridge.put("orange");
		assertTrue(fridge.contains("orange"));

		assertDoesNotThrow(() -> fridge.take("orange"));

		assertFalse(fridge.contains("orange"));
	}

}
