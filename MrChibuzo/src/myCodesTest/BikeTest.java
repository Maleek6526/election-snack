package myCodesTest;

import myCodes.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private static Bike newBike = new Bike();

    @Test
    public void testTurnOnAndOff() {
        newBike.turnOn();
        assertTrue(newBike.isOn());
        newBike.turnOff();
        assertFalse(newBike.isOn());
        assertEquals(0, newBike.getSpeed());
        assertEquals(1, newBike.getGear());
    }

    @Test

    public void testAcceleration() {
        newBike.turnOn();
        newBike.accelerate();
        assertEquals(1, newBike.getSpeed());
        assertEquals(1, newBike.getGear());

        newBike.accelerate();
        newBike.accelerate();
        assertEquals(3, newBike.getSpeed());
        assertEquals(1, newBike.getGear());

        newBike.turnOff();
        newBike.accelerate();
        assertEquals(0, newBike.getSpeed());
    }
}