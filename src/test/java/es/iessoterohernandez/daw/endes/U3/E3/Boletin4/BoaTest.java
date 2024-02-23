package es.iessoterohernandez.daw.endes.U3.E3.Boletin4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoaTest {

    @Test
    void testIsHealthyWithGranolaBars() {
        Boa boa = new Boa("Boa1", 5, "granola bars");
        assertEquals(true, boa.isHealthy());
    }

    @Test
    void testIsHealthyWithOtherFood() {
        Boa boa = new Boa("Boa2", 10, "other food");
        assertEquals(false, boa.isHealthy());
    }

    @Test
    void testFitsInCageWhenLengthIsLessThanCageLength() {
        Boa boa = new Boa("Boa3", 10, "granola bars");
        assertEquals(true, boa.fitsInCage(15));
    }

    @Test
    void testFitsInCageWhenLengthIsEqualToCageLength() {
        Boa boa = new Boa("Boa4", 10, "granola bars");
        assertEquals(false, boa.fitsInCage(10));
    }

    @Test
    void testFitsInCageWhenLengthIsGreaterThanCageLength() {
        Boa boa = new Boa("Boa5", 10, "granola bars");
        assertEquals(false, boa.fitsInCage(5));
    }
}
