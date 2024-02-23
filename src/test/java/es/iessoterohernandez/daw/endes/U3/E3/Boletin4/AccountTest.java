package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("John Doe", 123456789, 100);
    }

    @Test
    void testDeposit() {
        assertTrue(account.deposit(50));
        assertEquals(150, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        assertFalse(account.deposit(-50));
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw() {
        assertTrue(account.withdraw(50, 0));
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertFalse(account.withdraw(-50, 0));
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawExceedsBalance() {
        assertFalse(account.withdraw(150, 0));
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawWithFee() {
        assertTrue(account.withdraw(50, 10));
        assertEquals(40, account.getBalance());
    }

}
