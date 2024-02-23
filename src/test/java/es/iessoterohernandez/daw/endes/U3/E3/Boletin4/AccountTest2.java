package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class AccountTest2 {

	Account account;

	@BeforeEach

	void init() {

		account = new Account("Juan", 987654321987L, 234F);

	}

	@AfterEach

	void finish() {

		account = null;

	}

	@Test

	public void testDecimalFailure() {

		float balance = account.getBalance();

		for (int i = 0; i < 100; i++) {

			balance += 0.23F;

		}

		assertNotEquals(balance, 257F);

		assertEquals(balance, 256.99963F);
		

	}

}
