package ie.atu.Passenger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
    private Passenger myPass;

    @Test
    void testConstructorTitle() {
        myPass = new Passenger("Mr", "Lorcan", 1234567899, 29);
        assertEquals("Lorcan", myPass.getName());


    }

    @Test
    void testConstructorInvalidTitle() {
        final String invalid = "Invalid Title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, () -> new Passenger("Miss", "Lorcan", 1234567, 21));
        assertEquals(invalid, exceptionThrown. getMessage());
    }
}
